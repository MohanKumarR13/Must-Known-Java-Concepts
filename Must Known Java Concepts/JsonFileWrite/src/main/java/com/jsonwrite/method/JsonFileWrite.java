package com.jsonwrite.method;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonFileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name", "Mohan");
		jsonObject.put("Age", 24);
		
		//["magnetic smile","magnetic eyes"]
		JSONArray jsonArray=new JSONArray();
		jsonArray.add("magnetic smile");
		jsonArray.add("magnetic eyes");
		
		jsonObject.put("Special Qualities", jsonArray);
		FileWriter fileWriter =new FileWriter("mohan.json");
		fileWriter.write(jsonObject.toJSONString());
		fileWriter.close();
		

	}

}
