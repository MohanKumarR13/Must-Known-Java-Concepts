package com.log4jxmlconfig.method;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XmlLog4jConfig {

	static Logger logger=Logger.getLogger(XmlLog4jConfig.class);//Factory Design Pattern
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is Debug");
		logger.info("This is Info");
		logger.warn("This is Warning");
		logger.error("This is Error");
		logger.fatal("This is Fatal");
	}
}
