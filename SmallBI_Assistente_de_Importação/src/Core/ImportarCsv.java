package Core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ImportarCsv {
    public static DefaultTableModel importarArquivo(JTable tbl, String separador) {
        
        DefaultTableModel modelo = (DefaultTableModel) tbl.getModel();

        if (modelo.getRowCount() > 0) 
            modelo.setRowCount(0);        
        if (modelo.getColumnCount() > 0) 
            modelo.setColumnCount(0);        

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

            while ((linha = br.readLine()) != null) {
                Object[] obj = linha.split(separador);
                if (primeiraLinha) {
                    for (Object objColuna : obj) {
                        modelo.addColumn(objColuna);
                    }
                    primeiraLinha = false;
                } else {
                    modelo.addRow(obj);
                }
            }
            return modelo;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao importar arquivo: " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + ex.getMessage());
        }
        return null;
    }
}