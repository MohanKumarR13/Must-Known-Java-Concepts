package com.filereaderproperty.method;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
 static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.Chrome launch
		//2.Google.co.in
		FileInputStream fileInputStream=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String browser=properties.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		driver.get("https://www.google.co.in/");
	}

}
