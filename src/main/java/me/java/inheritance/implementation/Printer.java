package me.java.inheritance.implementation;

public class Printer implements Printable {
	private String phrase;

	public Printer(String phrase) {
		this.phrase = phrase;
	}

	@Override
	public void printPhrase() {
		System.out.println(phrase);
	}
}
