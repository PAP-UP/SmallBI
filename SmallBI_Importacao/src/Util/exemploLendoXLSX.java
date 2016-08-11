/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * @author Br
 */
public class exemploLendoXLSX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FileInputStream fisPlanilha = null;

        try {
            File file = new File("D:\\planilhas\\planilhaDaAula.xlsx");
            fisPlanilha = new FileInputStream(file);

            //cria um workbook = planilha toda com todas as abas
            XSSFWorkbook workbook = new XSSFWorkbook(fisPlanilha);

            //recuperamos apenas a primeira aba ou primeira planilha
            XSSFSheet sheet = workbook.getSheetAt(0);

            //retorna todas as linhas da planilha 0 (aba 1)
            Iterator<Row> rowIterator = sheet.iterator();

            //varre todas as linhas da planilha 0
            while (rowIterator.hasNext()) {

                //recebe cada linha da planilha
                Row row = rowIterator.next();

                //pegamos todas as celulas desta linha
                Iterator<Cell> cellIterator = row.iterator();

                //varremos todas as celulas da linha atual
                while (cellIterator.hasNext()) {

                    //criamos uma celula
                    Cell cell = cellIterator.next();

                    switch (cell.getCellType()) {

                        case Cell.CELL_TYPE_STRING:
                            System.out.println("TIPO STRING: " + cell.getStringCellValue());
                            break;

                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.println("TIPO NUMERICO: " + cell.getNumericCellValue());
                            break;
                            
                        case Cell.CELL_TYPE_FORMULA:
                            System.out.println("TIPO FORMULA: " + cell.getCellFormula());
                    }

                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(exemploLendoXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(exemploLendoXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fisPlanilha.close();
            } catch (IOException ex) {
                Logger.getLogger(exemploLendoXLSX.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
