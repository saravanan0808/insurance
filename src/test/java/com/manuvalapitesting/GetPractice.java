package com.manuvalapitesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetPractice {
	
	public void getMethod() throws IOException {
		URL url = new URL("https://omrbranch.com/api/flights");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		int responseCode = connection.getResponseCode();
		System.out.println(responseCode);
		String message = connection.getResponseMessage();
		System.out.println(message);
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputstreamreader = new InputStreamReader(inputStream);
		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while ((line = bufferedreader.readLine()) != null) {
			buffer.append(line);
			
		}
		System.out.println(buffer);

	}

	public static void main(String[] args) throws IOException {
		GetPractice gp = new GetPractice();
		gp.getMethod();

	}

}
