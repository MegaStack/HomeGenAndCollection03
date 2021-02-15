package com.gmail.oastro36;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		File fileText = new File("Wiki_Java.txt");
		List<Letter> letterList = new ArrayList<Letter>();
		fillList(letterList);
		String textFromFile = readTxtFile(fileText);
		List<Letter> letterListResult = new ArrayList<Letter>();
		letterListResult = calculateLetterCount(letterList, textFromFile);
		letterListResult.sort(new LetterComparator());
		LettersList ll = new LettersList(letterListResult);
		System.out.println(ll);
		
	}

	public static List<Letter> calculateLetterCount(List<Letter> list, String text) {
		char[] charsArray = text.toCharArray();
		for (Letter letter : list) {
			for (char c : charsArray) {
				if ((letter.getLetterSmall() == c) || (letter.getLetterBig() == c)) {
					letter.setCount(letter.getCount() + 1);
					
				}
			}
		}
		return list;
	}

	public static String readTxtFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader f = new BufferedReader(new FileReader(file))) {
			String str = "";
			for (; (str = f.readLine()) != null;) {
				sb.append(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static void fillList(List<Letter> list) {
		list.add(new Letter('q', 'Q', 0));
		list.add(new Letter('w', 'W', 0));
		list.add(new Letter('e', 'E', 0));
		list.add(new Letter('r', 'R', 0));
		list.add(new Letter('t', 'T', 0));
		list.add(new Letter('y', 'Y', 0));
		list.add(new Letter('u', 'U', 0));
		list.add(new Letter('i', 'I', 0));
		list.add(new Letter('o', 'O', 0));
		list.add(new Letter('p', 'P', 0));
		list.add(new Letter('a', 'A', 0));
		list.add(new Letter('s', 'S', 0));
		list.add(new Letter('d', 'D', 0));
		list.add(new Letter('f', 'F', 0));
		list.add(new Letter('g', 'G', 0));
		list.add(new Letter('h', 'H', 0));
		list.add(new Letter('j', 'J', 0));
		list.add(new Letter('k', 'K', 0));
		list.add(new Letter('l', 'L', 0));
		list.add(new Letter('z', 'Z', 0));
		list.add(new Letter('x', 'X', 0));
		list.add(new Letter('c', 'C', 0));
		list.add(new Letter('v', 'V', 0));
		list.add(new Letter('b', 'B', 0));
		list.add(new Letter('n', 'N', 0));
		list.add(new Letter('m', 'M', 0));	
	}
}
