package com.basicconfiglog4j.method;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfigLog4j {
	static Logger logger=Logger.getLogger(BasicConfigLog4j.class);//Factory Design Pattern
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		logger.debug("This is Debug");
		logger.info("This is Info");
		logger.warn("This is Warning");
		logger.error("This is Error");
		logger.fatal("This is Fatal");
	}

}
