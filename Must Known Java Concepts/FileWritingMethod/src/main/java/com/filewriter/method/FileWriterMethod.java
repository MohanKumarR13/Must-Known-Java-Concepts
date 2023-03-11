package com.filewriter.method;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1.File Location 2.Content
		 String location="FileWriterMethod.txt";
		 String content="File Writting Method";
		 FileWriter fileWriter=new FileWriter(location);
		 fileWriter.write(content);
		 fileWriter.close();
		 

	}

}
