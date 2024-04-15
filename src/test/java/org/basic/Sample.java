package org.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
	
		FileReader fileReader = new FileReader("C:\\\\Users\\\\lenovo\\\\eclipse-workspace1\\\\ApiProject\\\\src\\\\test\\\\resources\\\\Jsonfile.Json");
		JSONParser jsonparser = new JSONParser();
		Object parse = jsonparser.parse(fileReader);
		JSONObject jsonobject = (JSONObject)parse;
		Object object = jsonobject.get("data");
		JSONObject jsonobject2 = (JSONObject)object;
		
		Object object2 = jsonobject2.get("id");
		System.out.println(object2);
		
		Object object3 = jsonobject2.get("flightName");
		System.out.println(object3);
		
		Object object4 = jsonobject2.get("Country");
		System.out.println(object4);
		

		Object object5 = jsonobject2.get("Destinations");
		System.out.println(object5);


		Object object6 = jsonobject2.get("URL");
		System.out.println(object6);
		
		Object object7 = jsonobject2.get("Created_Date");
		System.out.println(object7);

		Object object8 = jsonobject2.get("Updated_Date");
		System.out.println(object8);

		Object object9 = jsonobject.get("support");
		JSONObject jsonobject3 = (JSONObject)object9;
		
		Object object10 = jsonobject3.get("url");
		System.out.println(object10);
		
		Object object11 = jsonobject3.get("text");
		System.out.println(object11);

	}
}