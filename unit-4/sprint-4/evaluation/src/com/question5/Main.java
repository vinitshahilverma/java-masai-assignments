package com.question5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void check(String str) {

		String st = str.toLowerCase();

		char[] ch = st.toCharArray();

		List<String> string = new ArrayList<>();

		String sum = "";

		for (int i = 0; i < ch.length; i++) {

			if ((ch[i] == ' ' || ch[i] == '!' || ch[i] == ';' || ch[i] == ':' || ch[i] == '.' || ch[i] == ','
					|| ch[i] == '?') && sum != "") {

				string.add(sum.trim());

				sum = "";

			}

			else if (i == ch.length - 1) {

				String sum1 = sum + ch[i];

				string.add(sum1.trim());
			}

			else {

				sum = sum + ch[i];
			}

		}

		System.out.println("Number of words : " + string.size());
		TreeSet<String> st1 = new TreeSet<>(string);

		System.out.println("Number of unique words : " + st1.size());

		List<String> st2 = new ArrayList<>(st1);

		for (int i = 0; i < st2.size(); i++) {

			System.out.println(i + ". " + st2.get(i));
		}

	}

	public static void main(String[] args) {

		String str = "hello Hello HEllo hi hi: hi! Welcome, welcome";

		check(str);
	}

}
