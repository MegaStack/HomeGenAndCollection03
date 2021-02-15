package com.gmail.oastro36;

import java.util.ArrayList;
import java.util.List;

public class LettersList {
	private ArrayList<Letter> listLetters;

	public LettersList(List<Letter> letterListResult) {
		super();
		this.listLetters = (ArrayList<Letter>) letterListResult;
	}

	public LettersList() {
		super();
	}

	public ArrayList<Letter> getListLetters() {
		return listLetters;
	}

	public void setListLetters(ArrayList<Letter> listLetters) {
		this.listLetters = listLetters;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Letter letter : listLetters) {
			sb.append(letter.toString());
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}
	
	
}
