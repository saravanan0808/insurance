package org.input;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main_Class {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file = new File("C:\\Users\\lenovo\\eclipse-workspace1\\ApiProject\\src\\test\\resources\\Traindata.json");
		ObjectMapper mapper = new ObjectMapper();
		Train t = mapper.readValue(file, Train.class);
		System.out.println("train name :"+t.getTrain_name());
		System.out.println("place :"+t.getPlace());
		System.out.println("time :"+t.getTime());
		ArrayList<String> arrayList = t.getTravel_place();
		for (String s : arrayList) {
			System.out.println(s);
			
		}
		

	}

}
