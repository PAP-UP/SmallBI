package business;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class ImportarCsv {
    
    
    private String separador;
    private JTable tbl;
    private DefaultTableModel modelo;
    
    private static boolean primeiroArquivo = true;
    
    public ImportarCsv(String separador, JTable tbl){
        this.separador = separador;
        this.tbl = tbl;
        this.modelo = (DefaultTableModel) tbl.getModel();
    }   
    
    public DefaultTableModel importarArquivo() {
        
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File("/backup/PAPIRO/PAP/SmallBI/Arquivos/"));
        jfc.setDialogTitle("Procurar Arquivo CSV");
        jfc.setFileFilter(new FileNameExtensionFilter(null, "csv"));
        jfc.showOpenDialog(jfc);

        if (jfc.getSelectedFile() != null) { 
            String caminho = new String();
            caminho = jfc.getSelectedFile().getPath();
            File file = new File(caminho);
            try {
                return importarCSV(file);
            } catch (IOException ex) {
                Logger.getLogger(ImportarCsv.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            modelo.setColumnCount(0);
        }
        return null;
    }

    private DefaultTableModel importarCSV(File file) throws FileNotFoundException, IOException {

        if(primeiroArquivo){            
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            String linha;
            boolean primeiraLinha = true;
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
            primeiroArquivo = false;            
        }else{
            
            int numColunasAnterior = modelo.getColumnCount();
            int numLinhas = getNumLinhas(file);
            int numColunas = setColumns(file);
            
            modelo.setRowCount(numLinhas);
            
            String[][] matriz = setMatrizDadosExistentes(numLinhas, numColunas);
            matriz = setMatrizNovosDados(file, matriz, numColunasAnterior, numColunas);  
            modelo = setModelFromMatriz(matriz, numLinhas, numColunas);
                        
            for(int i = 0; i < numLinhas; i++){
                for(int j = 0; j < numColunas; j++){
                        if(modelo.getValueAt(i, j) != null){
                            System.out.println("L:" + i + ", C:" + j + ", Valor: "+ modelo.getValueAt(i, j));
                        }
                }
                System.out.println("\n");
            }         
        }
        return modelo;
    } 
    
    private DefaultTableModel setModelFromMatriz(String[][] matriz, int numLinhas, int numColunas){
        for(int i = 0; i < numLinhas; i++){
            Object[] objects = new Object[numColunas];
            for(int j = 0; j < numColunas; j++){
                objects[j] = matriz[i][j];
            }
            modelo.removeRow(i);
            modelo.insertRow(i, objects);
        }
        return modelo;
    }
    
    private String[][] setMatrizNovosDados(File file, String[][] matriz, int numColunasAnterior, int numColunas) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        int line = 0;
        String linha = br.readLine();
        while((linha = br.readLine()) != null){
            Object[] objects = linha.split(separador);
            int contadorArrayObject = 0;
            for(int column = numColunasAnterior; column < numColunas; column++){
                matriz[line][column] = objects[contadorArrayObject].toString();
                contadorArrayObject++;
            }
            line++;
        }
        return matriz;
    }
    
    private String[][] setMatrizDadosExistentes(int numLinhas, int numColunas){
        String[][] matriz = new String[numLinhas][numColunas];
        for(int i = 0; i < numLinhas; i++){
            for(int j = 0; j < numColunas; j++){
                if(modelo.getValueAt(i, j) != null){
                    matriz[i][j] = modelo.getValueAt(i, j).toString();
                }
            }
        }
        return matriz;
    }
    
    private int setColumns(File file) throws FileNotFoundException, IOException{
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        String linha;
        boolean primeiraLinha = true;
        while ((linha = br.readLine()) != null) {
            Object[] obj = linha.split(separador);
            if (primeiraLinha) {
                for (Object objColuna : obj) {
                    modelo.addColumn(objColuna);
                }
                primeiraLinha = false;
            }
        }
        return modelo.getColumnCount();
    }
    
    private int getNumLinhas(File file) throws IOException{        
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        String linha;              
        int numeroLinhas = 0;
        boolean primeiraLinha = true;
        
        while ((linha = br.readLine()) != null) { 
            numeroLinhas++;
        }
        return numeroLinhas;
    }
}