package me.java.inheritance;

import me.java.inheritance.implementation.Buildable;
import me.java.inheritance.implementation.EnglishHelloBuilder;
import me.java.inheritance.implementation.KittyHelloBuilder;
import me.java.inheritance.implementation.Printer;

public class Client {
	public static void main(String[] args) {
		Buildable englishBuilder = new EnglishHelloBuilder();
		Buildable kittyBuilder = new KittyHelloBuilder("김고양");

		Printer printer = new Printer();

		printer.print(kittyBuilder.getPhrase());
		printer.print(englishBuilder.getPhrase());
	}
}
