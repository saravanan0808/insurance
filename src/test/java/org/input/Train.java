package org.input;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class Train {
	private String train_name;
	private String place;
	private int time;
	private ArrayList<String> travel_place;

}
