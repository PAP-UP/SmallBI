/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author deynesonborba
 */
public class Util {
    public static String formatarString(String str){
        String strFormatada = str.toLowerCase();
        strFormatada = strFormatada.replaceAll(" ", "_");
        strFormatada = strFormatada.replaceAll("-", "_");
        strFormatada = strFormatada.replaceAll(":", "_");
        return strFormatada;
    }
}
