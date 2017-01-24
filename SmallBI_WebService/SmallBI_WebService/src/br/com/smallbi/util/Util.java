package br.com.smallbi.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Util {

	public static Date getDate(){
		Calendar calendar = new GregorianCalendar();
		return calendar.getTime();
//		return format.format(calendar.getTime());
	}
	
	public static String formatDate(Date date){
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(date);
	}
}
