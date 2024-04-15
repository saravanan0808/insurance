package org.task;

import java.util.ArrayList;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Day2Task2 {
	 	
		private int page;
		private int per_page;
		private int total;
		private int total_pages;
		private ArrayList<Task2Data> data;
		private Task2Support support;

}
