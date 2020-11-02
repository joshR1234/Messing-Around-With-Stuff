package com.cogent.practice;

public class StringLookup {

	public static void main(String args[]) {
	
		//parse system args
		//not entirely sure how you're inputting, so I'm adding everything into 1
		//massive string and then splitting it at first T= 
		//since you're always leading with S=
		String allArgs = "";
		for(int i = 0; i<args.length; i++) {
			allArgs += args[i]+" ";
		}
		
        String[] params = allArgs.split("T=", 2); 
		
        //cut off the S=
        String lookupString = params[0].toLowerCase();
		lookupString = lookupString.substring(2, lookupString.length());
		
		//Split already removes T=
		String stringsToLookUp = params[1].toLowerCase();
		
		
		
		//split T= string into the various words to lookup
		String[] splitWords = splitString(stringsToLookUp);
		
		//System.out.println(lookupString);
		//System.out.println(stringsToLookUp);
		
		//if T="" then just output false, not sure how you want to handle no words
		if(stringsToLookUp.isEmpty()) {
			System.out.println("false");
			return;
		}
		
		//lookup logic 2 ways
		for(int i =0; i < splitWords.length;i++) {
			//System.out.print(splitWords[i] + ": ");
			System.out.println(lookupLoop(lookupString, splitWords[i]));
		}
	}
	
	//helper to split strings
	static String[] splitString(String words) {
        String[] arrOfWords = words.split(" ", 0); 
		return arrOfWords;
	}
	
	//easy way with built in contains
	static boolean lookupWithContains(String lookupString, String word) {
		return lookupString.contains(word);
	}
	
	//slightly harder with iterating through lookup string and matching
	static boolean lookupLoop(String lookupString, String word) {
		
		for(int i = 0; i<=lookupString.length()-word.length();i++) {
			String subs = lookupString.substring(i,word.length()+i);
			if(subs.equals(word)) {
				return true;
			}
		}
		
		return false;
		
	}
}
