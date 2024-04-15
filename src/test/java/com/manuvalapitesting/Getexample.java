package com.manuvalapitesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Getexample {
	
	public void getmethod() throws IOException {
		URL url = new URL("https://omrbranch.com/api/flights");
		HttpURLConnection connection = (HttpURLConnection) url .openConnection();
		connection.setRequestMethod("GET");
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode );
		String requestMessage = connection.getResponseMessage();
		System.out.println(requestMessage);
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);
			
      	}
		
		System.out.println(buffer);
//		while (line!=null) {
//			System.out.println(line);
//		}		

	}
	
	public static void main(String[] args) throws IOException {
		Getexample getexample =new Getexample();
		getexample.getmethod();
	}

}
