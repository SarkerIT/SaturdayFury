package com.upskill.java_2;

// switch case can only be used for  
// int, short, byte datqa types
public class SwitchDay {

	public static void main(String[] args) {
		float[] fl = { 0.1f, 0.2f, 0.3f, 0.4f, 0.5f };
		System.out.println(fl[1]);

		String[] days = { "Sat", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri" };

		for (int i = 0; i < 7; i++) {

			// SWITCH cannot be used for string!!!
//			days = days[i];
//			switch(days) {
//			case "Sat":
//			System.out.println(fl[1]);
//			float fl= fl[i];  // does not work
//		switch(fl) {   // does not work
//		case (0.01f):
//			System.out.println(0.01f);
		}

	}
}
