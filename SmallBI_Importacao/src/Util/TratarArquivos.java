package Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TratarArquivos {

    public static int tamanhoCampoVarchar = 0;

    public static DefaultTableModel importar(JTable tbl, String separador) {

        DefaultTableModel modelo = (DefaultTableModel) tbl.getModel();

        if (modelo.getRowCount() > 0) {
            modelo.setRowCount(0);
        }

        if (modelo.getColumnCount() > 0) {
            modelo.setColumnCount(0);
        }

        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File("/media/deynesonborba/Backup/PAPIRO/PAP/SmallBI/Arquivos/"));
        //jfc.setCurrentDirectory(new File("B:\\PAPIRO\\PAP\\SmallBI\\Arquivos"));
        //jfc.setCurrentDirectory(new File ("%HOMEPATH%"));
        jfc.setDialogTitle("Procurar Arquivo");

        jfc.setFileFilter(new FileNameExtensionFilter(null, "csv", "xlsx"));

        jfc.showOpenDialog(jfc);

        String caminho = new String();

        if (jfc.getSelectedFile() != null) {

            caminho = jfc.getSelectedFile().getPath();

            String extensao = caminho.substring(caminho.lastIndexOf("."));

            File arquivo = new File(caminho);

            if (extensao.equals(".csv")) {
                return modelo = importarCSV(separador, modelo, arquivo);
            } else if (extensao.equals(".xlsx")) {
                return modelo = importarXLSX(arquivo, modelo);
            }
        }else{
            modelo.setColumnCount(0);
        }
        return null;
    }

    private static DefaultTableModel importarXLSX(File arquivo, DefaultTableModel modelo) {
        
        try {
            FileInputStream fis = new FileInputStream(arquivo);
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

    public static String validarTipagemDosCampos(JTable tblArquivo, List<JComboBox> listaDeCbx) {

        int coluna = 0;
        String msg = new String();
        String strValorCampo = new String();
        boolean erro = true;

        try {
            for (JComboBox cbx : listaDeCbx) {
                for (int linha = 0; linha < tblArquivo.getRowCount(); linha++) {

                    erro = true;
                    msg = "Erro ao definir tipo de dado: \nColuna: " + tblArquivo.getColumnName(coluna)
                            + "\nLinha: " + linha;

                    if(tblArquivo.getModel().getValueAt(linha, coluna) != null){
                        strValorCampo = tblArquivo.getModel().getValueAt(linha, coluna).toString();
                    }else{
                        strValorCampo = " ";
                    }

                    //if (!strValorCampo.equals(" ")) {
                        switch (cbx.getModel().getSelectedItem().toString()) {
                            case "Selecione":
                                return msg = "Selecione o tipo dos dados da coluna "
                                        + tblArquivo.getColumnName(coluna);

                            case "Texto":
                                String s = strValorCampo;
                                if (s.length() > tamanhoCampoVarchar) {
                                    tamanhoCampoVarchar = s.length();
                                }
                                erro = false;
                                break;

                            case "V/F":
                                if(strValorCampo.equals(" ")){
                                    erro = false;
                                }else{
                                    if (strValorCampo.equals("true") || strValorCampo.equals("false")) {
                                        erro = false;
                                    }
                                }                                
                                break;

                            case "Inteiro":
                                if(strValorCampo.equals(" ")){
                                    erro = false;
                                }else{
                                    Integer inteiro = new Integer(strValorCampo);
                                    erro = false;
                                }                                
                                break;

                            case "Real":
                                if(strValorCampo.equals(" ")){
                                    erro = false;
                                }else{
                                    Float real = new Float(strValorCampo);
                                    erro = false;
                                }
                                break;

                            case "Caractere":
                                if(strValorCampo.equals(" ")){
                                    erro = false;
                                }else{
                                    if (strValorCampo.length() == 1) {
                                        CharSequence c = tblArquivo.getModel().getValueAt(linha, coluna).
                                            toString();
                                        erro = false;
                                    } else {
                                        erro = true;
                                    }
                                }
                                break;

                            case "Data dd-MM-yyyy":
                                if(strValorCampo.equals(" ")){
                                   erro = false; 
                                }else{
                                    if (strValorCampo.length() > 0) {
                                        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                                        sdf.setLenient(false);
                                        try {
                                            sdf.parse(strValorCampo);
                                            erro = false;
                                        } catch (Exception e) {
                                            erro = true;
                                        }   
                                    }
                                }                                
                                break;

                            case "Data MM-dd-yyyy":
                                if(strValorCampo.equals(" ")){
                                    erro = false;
                                }else{
                                    if (strValorCampo.length() > 0) {
                                        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
                                        sdf.setLenient(false);
                                        try {
                                            sdf.parse(strValorCampo);
                                            erro = false;
                                        } catch (Exception e) {
                                            erro = true;
                                        }
                                    }
                                }                                
                                break;
                        }
                    //}
                    if (erro) {
                        return msg;
                    }
                }
                coluna++;
            }
            return msg = "Campos validados com sucesso!";
        } catch (Exception e) {
            return msg;
        }
    }
}