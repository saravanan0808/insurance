package org.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Day2 {
	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader filereader = new FileReader("C:\\Users\\lenovo\\eclipse-workspace1\\ApiProject\\src\\test\\resources\\secondtask");
		JSONParser jsonParse = new JSONParser();
		Object parse = jsonParse.parse(filereader);
		JSONObject object = (JSONObject)parse;
		
		Object object2 = object.get("page");
		System.out.println(object2);
		
		Object object3 = object.get("per_page");
		System.out.println(object3);
		
		Object object4 = object.get("total");
		System.out.println(object4);
		
		Object object5 = object.get("total_pages");
		System.out.println(object5);
		
		Object object6 = object.get("data");
		JSONArray array = (JSONArray)object6;
		
		for (int i = 0; i < array.size(); i++) {
			Object object7 = array.get(i);
			JSONObject json = (JSONObject)object7;
			
			Object id = json.get("id");
			System.out.println(id);
			
			Object fname = json.get("flightName");
			System.out.println(fname);
					
			Object country = json.get("Country");
			System.out.println(country);
			
			Object destination = json.get("Destinations");
			System.out.println(destination);
			
			Object url = json.get("URL");
			System.out.println(url);			
		}
		
		Object object7 = object.get("support");
		JSONObject json2 = (JSONObject)object7;
		
		Object object8 = json2.get("url");
		System.out.println(object8);
		
		Object object9 = json2.get("text");
		System.out.println(object9);
		
	}

}
