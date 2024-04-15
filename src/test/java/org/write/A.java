package org.write;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class A {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		//create the json file
		File file = new File("C:\\Users\\lenovo\\eclipse-workspace1\\ApiProject\\src\\test\\resources\\new.json");
		
		//create mapper
		ObjectMapper mapper = new ObjectMapper();
		
		//set the value
		Address add = new Address("sankar street","chennai",60037);
		Employee emp = new Employee("anu","s",7871445456l,add);
		
		//execute the program
		mapper.writeValue(file, emp);
		
	}

}
