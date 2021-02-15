package com.gmail.oastro36;

public class Letter {
	private char letterSmall;
	private char letterBig;
	private int count;

	public Letter(char letterSmall, char letterBig, int count) {
		super();
		this.letterSmall = letterSmall;
		this.letterBig = letterBig;
		this.count = count;
	}

	public Letter() {
		super();
	}

	public char getLetterSmall() {
		return letterSmall;
	}

	public void setLetterSmall(char letterSmall) {
		this.letterSmall = letterSmall;
	}

	public char getLetterBig() {
		return letterBig;
	}

	public void setLetterBig(char letterBig) {
		this.letterBig = letterBig;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Letter " + letterSmall + " and " + letterBig + ", count=" + count;
	}
}
