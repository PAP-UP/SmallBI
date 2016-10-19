package Core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ImportarXlsx {
    public static DefaultTableModel importarArquivo(JTable tbl) {
        
        DefaultTableModel modelo = (DefaultTableModel) tbl.getModel();

        if (modelo.getRowCount() > 0) 
            modelo.setRowCount(0);        
        if (modelo.getColumnCount() > 0) 
            modelo.setColumnCount(0);        

        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File("/backup/PAPIRO/PAP/SmallBI/Arquivos/"));
        jfc.setDialogTitle("Procurar Arquivo CSV");
        jfc.setFileFilter(new FileNameExtensionFilter(null, "xlsx"));
        jfc.showOpenDialog(jfc);

        if (jfc.getSelectedFile() != null) {  
            String caminho = new String();
            caminho = jfc.getSelectedFile().getPath();
            File arquivo = new File(caminho);
            return importarXlsx(modelo, arquivo);
        }else{
            modelo.setColumnCount(0);
        }
        return null;
    }
    
    private static DefaultTableModel importarXlsx(DefaultTableModel modelo, File arquivo){
        try {
            FileInputStream fis = new FileInputStream(arquivo);
            //10485760 bytes == 10 Mb
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();

            boolean primeiraLinha = true;
            int colunas = 0;

            while (rowIterator.hasNext()) {
                String linhaCompleta = new String();
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.iterator();
                Cell cell = null;

                if (primeiraLinha) {
                    while (cellIterator.hasNext()) {
                        cell = cellIterator.next();
                        modelo.addColumn(tiposDeCell(cell));
                        colunas++;
                    }
                } else {
                    for (int c = 0; c < colunas; c++) {
                        cell = row.getCell(c);
                        linhaCompleta += tiposDeCell(cell) + ",";
                    }
                }

                if (!primeiraLinha) {
                    Object[] obj = linhaCompleta.split(",");
                    modelo.addRow(obj);
                }
                primeiraLinha = false;
            }
            return modelo;

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao importar arquivo: " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao instânciar workbook: " + ex.getMessage());
        }
        return null;
    }
    
     private static String tiposDeCell(Cell cell) {
        String str = new String();
        if (cell == null) {
            return " ";
        }
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_BLANK:
                str = " ";
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                str = String.valueOf(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_ERROR:
                str = String.valueOf(cell.getErrorCellValue());
                break;
            case Cell.CELL_TYPE_FORMULA:
                str = String.valueOf(cell.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_NUMERIC:
                str = String.valueOf(cell.getNumericCellValue());
                break;
            case Cell.CELL_TYPE_STRING:
                str = cell.getStringCellValue();
                break;
        }
        return str;
    }
}
