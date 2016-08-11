/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Br
 */
public class PrograminhasImportarCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
       //abre um arquivo e cria um file
       File arquivoCSV = new File("D:\\clientes.csv");
        
        try{
            
            //cria um scanner para ler o arquivo
            Scanner leitor = new Scanner(arquivoCSV);
            
            //variavel que armazenara as linhas do arquivo
            String linhasDoArquivo = new String();
            
            //ignora a primeira linha do arquivo
            leitor.nextLine();
            
            //percorre todo o arquivo
            while(leitor.hasNext()){
                
                //recebe cada linha do arquivo
                linhasDoArquivo = leitor.nextLine();
                
                //separa os campos entre as virgulas de cada linha
                String[] valoresEntreVirgulas = linhasDoArquivo.split(",");
                
                //imprime a coluna que quiser
                System.out.println(valoresEntreVirgulas[2]);
            }
        
        }catch(FileNotFoundException e){
            
        }
        
    }
    
}
