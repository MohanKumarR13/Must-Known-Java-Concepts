package com.filereader.method;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMethod {
	static String currerntLineReader;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="C:\\Users\\Mohan\\Documents\\Must Known Java Concepts\\FileReaderMethod\\ReaderFile.txt";
		FileReader fileReader=new FileReader(location);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		while((currerntLineReader=bufferedReader.readLine()) != null) {
			System.out.println(currerntLineReader);

		}
	}

}
