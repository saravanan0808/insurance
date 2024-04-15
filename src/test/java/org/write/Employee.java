package org.write;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private String Fname;
	private String Lname;
	private long number;
	private Address address;
	
	
}