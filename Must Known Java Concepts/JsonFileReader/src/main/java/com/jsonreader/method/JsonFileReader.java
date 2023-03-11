package com.jsonreader.method;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileReader {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("mohan.json");
		Object objectJsonParser = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) objectJsonParser;
		String name = (String) jsonObject.get("Name");
		Long age = (long) jsonObject.get("Age");
		JSONArray array = (JSONArray) jsonObject.get("Special Qualities");
		Iterator iterator = array.iterator();
		System.out.println("Name is :" + name);
		System.out.println("Age is :" + age);

		while (iterator.hasNext()) {
			System.out.println("Special Qualities :" + iterator.next());

		}
	}

}
