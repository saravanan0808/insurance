package org.task;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Task2Data {
	
	private int id;
	private String flightName;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("Destinations")
	private String destinations;
	@JsonProperty("URL")
	private String uRL;

}
