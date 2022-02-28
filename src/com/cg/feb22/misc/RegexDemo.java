package com.cg.feb22.misc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

//		String input = "abcd";
//		String regex = "bc"; // true

//		Pattern pat = Pattern.compile(regex);
//
//		Matcher mat = pat.matcher(input);

//		System.out.println(mat.matches()); // false
//		System.out.println(mat.find()); // true
//		System.out.println(mat.lookingAt()); // false

		String input = "string@gmail.com";
		String regex = "[^@]";
		
		Pattern pat = Pattern.compile(regex);

		Matcher mat = pat.matcher(input);

		System.out.println(mat.matches());
	}
}
