package com.secl.metrica.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;




public class DateUtil {
	
	private static String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	//private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);
	
	@SuppressWarnings("null")
	public synchronized String getFormatDate(final String dateFormat, Date date)
	{
		if(dateFormat != null || !dateFormat.isEmpty())
		{
			DATE_TIME_FORMAT = dateFormat;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_FORMAT);
		return sdf.format(date);
	}
	
	@SuppressWarnings("null")
	public synchronized Date getFormatDate(final String dateFormat, String strDate)
	{
		if(dateFormat != null || !dateFormat.isEmpty())
		{
			DATE_TIME_FORMAT = dateFormat;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_FORMAT);
		Date date = null;
		try 
		{
			date = sdf.parse(strDate);
		}
		catch (Exception e) 
		{
			//logger.error("An Exception occured while parse a Date String to Date Object : ", e);
		}
		return date; 
	}

	@SuppressWarnings("null")
	public synchronized String getSystemDate(final String dateFormat)
	{
		if(dateFormat != null || !dateFormat.isEmpty())
		{
			DATE_TIME_FORMAT = dateFormat;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_FORMAT);
		return sdf.format(new Date());
	}
	
	@SuppressWarnings("null")
	public synchronized String convertUTCDate(final String dateFormat, String strDate,TimeZone tz)
	{
		SimpleDateFormat sdf = new SimpleDateFormat();
		try
		{
			if(dateFormat != null || !dateFormat.isEmpty())
			{
				DATE_TIME_FORMAT = dateFormat;
			}
			sdf.applyPattern(DATE_TIME_FORMAT);
			sdf.setTimeZone(tz);
			Date date = sdf.parse(strDate);		
			sdf.setTimeZone(TimeZone.getTimeZone("UTC"));			
			strDate = sdf.format(date);
		}
		catch (ParseException e)
		{
			//logger.error("An Exception occured while convert a UTC Date to Local Date : ", e);
		}
		return strDate;
	}
	
	@SuppressWarnings("null")
	public synchronized String convertLocalDate(final String dateFormat, String strDate, TimeZone tz)
	{
		SimpleDateFormat sdf = new SimpleDateFormat();
		try
		{
			if(dateFormat != null || !dateFormat.isEmpty())
			{
				DATE_TIME_FORMAT = dateFormat;
			}
			sdf.applyPattern(DATE_TIME_FORMAT);
			sdf.setTimeZone(TimeZone.getTimeZone("UTC"));			
			Date date = sdf.parse(strDate);
			sdf.setTimeZone(tz);
			strDate = sdf.format(date);
		}
		catch (ParseException e)
		{
			//logger.error("An Exception occured while convert a UTC Date to Local Date : ", e);
		}
		return strDate;
	}
	
	
	public static String getStringDateFromDate(Date date)
	{
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		try 
		{
			String dateStr=simpleDateFormat.format(date).toString();
			return dateStr;
		} 
		catch (Exception e) 
		{
			return null;
		}
	}

}
