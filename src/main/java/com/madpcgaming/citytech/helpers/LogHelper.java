package com.madpcgaming.citytech.helpers;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.madpcgaming.citytech.lib.Reference;

public class LogHelper
{
	private static Logger CTLog = LogManager.getLogger(Reference.MOD_ID);
	
	
	public static void log(Level l, String s)
	{
		log(l, s, (Object) null);
	}
	
	public static void log(Level l, String s, Object... args)
	{
		if (!s.startsWith("&&"))
			CTLog.log(l, s);
		else
		{
			String msg = String.format(s.substring(2), args);
			CTLog.log(l, msg);
		}
	}
	
	public static void info(String s)
	{
		log(Level.INFO, s, (Object) null);
	}
	
	public static void info(String s, Object... args)
	{
		log(Level.INFO, s, args);
	}
	
	public static void severe(String string, Object... args)
	{
		log(Level.FATAL, string, args);
	}
	
	public static void severe(String string)
	{
		log(Level.FATAL, string, (Object) null);
	}
}
