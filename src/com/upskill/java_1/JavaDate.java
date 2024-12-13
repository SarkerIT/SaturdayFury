package com.upskill.java_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate currentDateObj = LocalDate.now(); 						// create a date object
		System.out.println("Todays date: " + currentDateObj);       		// print the current date now
		
		
		LocalTime currentLocalTime = LocalTime.now();						// local time
		System.out.println("Time now: "+ currentLocalTime);
		
		// Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Time now: "+ currentLocalTime.format(formatter));

	}

}
