package com.propertyfilelog4jconfig.method;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileLog4jConfig {

	static Logger logger=Logger.getLogger(PropertyFileLog4jConfig.class);//Factory Design Pattern
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is Debug");
		logger.info("This is Info");
		logger.warn("This is Warning");
		logger.error("This is Error");
		logger.fatal("This is Fatal");
	}

}
