package business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ImportarCsv {
    public static DefaultTableModel importarArquivo(JTable tbl, String separador) {
        
        DefaultTableModel modelo = (DefaultTableModel) tbl.getModel();

//        if (modelo.getRowCount() > 0) 
//            modelo.setRowCount(0);        
//        if (modelo.getColumnCount() > 0) 
//            modelo.setColumnCount(0);        

        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File("/backup/PAPIRO/PAP/SmallBI/Arquivos/"));
        jfc.setDialogTitle("Procurar Arquivo CSV");
        jfc.setFileFilter(new FileNameExtensionFilter(null, "csv"));
        jfc.showOpenDialog(jfc);

        if (jfc.getSelectedFile() != null) { 
            String caminho = new String();
            caminho = jfc.getSelectedFile().getPath();
            File arquivo = new File(caminho);
            return importarCSV(separador, modelo, arquivo);
        }else{
            modelo.setColumnCount(0);
        }
        return null;
    }

    private static DefaultTableModel importarCSV(String separador, DefaultTableModel modelo, File arquivo) {
        
        
        
        try {
            FileInputStream fis = new FileInputStream(arquivo);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            boolean primeiraLinha = true;
            String linha = new String();
            
            
            linha = br.readLine();
            Object[] objColunas = linha.split(separador);
            for (Object objColuna : objColunas) {
                modelo.addColumn(objColuna);
            }
                          
            List<String> dadosPorColuna = new ArrayList<>();
            
            for(int i = 0; i < modelo.getColumnCount(); i++){
                
                linha = br.readLine();
                Object[] objects = linha.split(separador);
                Object obj = objects[i];
                Object[] objPorColuna;
                
                for(int j = 0; j < modelo.getRowCount(); i++){
                    dadosPorColuna.add(obj.toString());
                    
                }
            }
            
            for(int i = 0; i < modelo.getColumnCount(); i++){
                linha = br.readLine();
                Object[] objects = linha.split(separador);
                Object obj = objects[1];
                Scanner scanner = new Scanner(arquivo);
                
                //System.out.println(obj[i]);
            }
                        
//            while ((linha = br.readLine()) != null) {
//                obj = linha.split(separador);
//                if (primeiraLinha) {
//                    for (Object objColuna : obj) {
//                        modelo.addColumn(objColuna);
//                    }
//                    primeiraLinha = false;
//                } else {
//                    modelo.addRow(obj);
//                }
//            }
            
            
            
            
            return modelo;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao importar arquivo: " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + ex.getMessage());
        }
        return null;
    }
}