package org.task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task2 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		//mention the path of Json
		File file = new File("C:\\Users\\lenovo\\eclipse-workspace1\\ApiProject\\src\\test\\resources\\secondtask.json");
		
		//create the object for objectmapper class
		ObjectMapper mapper = new ObjectMapper();
		
     // 3. Pass the Json file and Root POJO ClassName to fetch values
		Day2Task2 task = mapper.readValue(file, Day2Task2.class);
		
		int page = task.getPage();
		int per_page = task.getPer_page();
		int total = task.getTotal();
		int total_pages = task.getTotal_pages();
		
		System.out.println(page);
		System.out.println(per_page);
		System.out.println(total);
		System.out.println(total_pages);
		System.out.println();
		
		ArrayList<Task2Data> data = task.getData();
		for (Task2Data task1 : data) {
			System.out.println("Data:");
			System.out.println("ID :"+task1.getId());
			System.out.println("FlightName :"+task1.getFlightName());
			System.out.println("Country :"+task1.getCountry());
			System.out.println("Destinations :"+task1.getDestinations());
			System.out.println("URL :"+task1.getURL());
		}
		Task2Support s = task.getSupport();
		System.out.println("Support:");
		System.out.println("URL :"+s.getUrl());
		System.out.println("Text :"+s.getText());
		

		
	}

}
