package com.upskill.PracticeProblems;

// Write a program to swap two string variables (Hello, World!)
// and display result on the screen.

// second way with personal customization

public class Swap_String_Easier_way {

	
	
	public static void main(String[] args) {
		// Given string
		String str = "Hello, World";
		
		int strLength = str.length();
		
		boolean isSpace = false;
		String word1= "";
		String word2 ="";
		
		
		for(int i=0; i<strLength; i++) {
			
			char car = str.charAt(i);
			if(car !=' ' && isSpace==false) {
				if(car ==',') { // remove the comma
						continue;				
				}else {
					word1= word1+car;  // as long as space is not there put the characters in word1
				}
			}else if(car ==' ') {  // as soon as find the space move on to the next word
				isSpace = true;
			}else {
				word2=word2+car;  // put the rest letters in the second word — word2
			}			
		}		
		
		System.out.println(word2 + ", " + word1); // add a comma in between the words.
		
	}
}
