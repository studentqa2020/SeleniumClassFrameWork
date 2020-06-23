package com.sanity;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.report.ExtentManager;

public class LoggerTest extends ExtentManager{
	
	private static Logger log = LogManager.getLogger(LoggerTest.class);//==> log4j2
	
	public static void main(String[] args) {
		
		System.out.println("Info");	
				
				log.info("Info");	
				log.debug("debug");
				log.error("error");
				log.fatal("fatal");
				log.warn("waring");
				
			
	}

}















//log4j2 
//Properties props = new Properties();
//try {
//	props.load(new FileInputStream("log4j.properties"));
//} catch (Exception e) {
//	e.printStackTrace();
//}
//