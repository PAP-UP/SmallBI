package br.com.smallbi.util;


public class Util {
	public static String formatFloat(float value){
		return String.format("%.2f", value);
	}
	
	public static String removeDatabaseSize(float value){
		if(value <= 7.1436)
			return "0";
		else{
			Double dValue = value - 7.1436;
			String strValue = dValue.toString();
			float fValue = Float.parseFloat(strValue);
			return String.format("%.2f", fValue);
		}
	}
}