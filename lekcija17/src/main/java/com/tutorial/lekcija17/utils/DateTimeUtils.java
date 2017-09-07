package com.tutorial.lekcija17.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
	
	private String danasnjiDatum;

	
	
	public DateTimeUtils() {
		
		this.danasnjiDatum = danasJeDatum();
	}

	public String getDanasnjiDatum() {
		return danasnjiDatum;
	}

	private String danasJeDatum() {
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	
	
	
	
}
