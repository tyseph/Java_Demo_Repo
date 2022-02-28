package com.cg.feb22.misc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class panCard {

	public static void main(String[] args) {

		String input = "ABC4E1234A";
		String regex = "\\p{Upper}{5}\\d{4}\\p{Upper}{1}";

		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(input);

		System.out.println(mat.matches());
	}
}
