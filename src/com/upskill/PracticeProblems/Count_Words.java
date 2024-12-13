package com.upskill.PracticeProblems;

public class Count_Words {

	public static void main(String[] args) {
		
		// built-in .split method
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);
		
		countWords2("Hello World!");
		
	}	
	
	
	// Regular iterative method with a for loop
	public static void countWords2(String str) {
		int countNum = 0;
		String sentence = str;
		
		for(int i=0; i<sentence.length()-1; i++) {
			if(sentence.charAt(i)!=' ') {
				continue;
			}else {
				countNum++;
			}
		}		
		System.out.println(countNum+1);		
	}
}
