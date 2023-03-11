package com.path.method;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="FilesPath.txt";
		 String content="Eagle is Coming";
		 
		 Path path=Paths.get(location);
		 Files.write(path,content.getBytes());

	}

}
