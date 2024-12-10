package com.upskill.assignment_2;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Hello World";

		int len = name.length();

		String revName = "";

		for (int i = len - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}

		System.out.print(revName);

	}
}
