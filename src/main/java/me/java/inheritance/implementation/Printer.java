package me.java.inheritance.implementation;

public class Printer implements Printable {

	@Override
	public void print(String phrase) {
		System.out.println(phrase);
	}
}
