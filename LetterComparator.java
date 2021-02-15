package com.gmail.oastro36;

import java.util.Comparator;

public class LetterComparator implements Comparator<Letter> {

	@Override
	public int compare(Letter lOne, Letter lTwo) {
		Letter letterOne = (Letter) lOne;
		Letter letterTwo = (Letter) lTwo;

		if (letterOne.getCount() > letterTwo.getCount()) {
			return -1;
		}
		if (letterOne.getCount() < letterTwo.getCount()) {
			return 1;
		}
		return 0;
	}
}
