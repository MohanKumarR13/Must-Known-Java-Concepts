package com.fileoutputstream.method;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMehod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location = "FileOutputStreamMehod.txt";
		String content = "Pokemon";
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		byte[] contents = content.getBytes();
		fileOutputStream.write(contents);
		fileOutputStream.close();
	}

}
