package com.coding.round;

import java.util.Scanner;

public class AdjacentLetter {
	public static String modifyString(String inp_string ){
		StringBuilder modified = new StringBuilder();

		for (char c : inp_string.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				char newChar = (char) ('a' + (c - 'a' + 1) % 26);
				modified.append("aeiou".contains(String.valueOf(newChar)) ? Character.toUpperCase(newChar) : newChar);
			} else {
				modified.append(c);
			}
		}

		return modified.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp_string = sc.nextLine();
		String result = modifyString(inp_string);
		System.out.println(result);
	}
}
