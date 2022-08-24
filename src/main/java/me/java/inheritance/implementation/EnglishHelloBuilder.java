package me.java.inheritance.implementation;

public class EnglishHelloBuilder implements Buildable {
	private String phrase;

	public EnglishHelloBuilder() {
		this.phrase = "";
	}

	@Override
	public void sayHello() {
		phrase += "Hello from " + this.getClass().getSimpleName();
	}

	@Override
	public void niceTo() {
		phrase += " and say nice to";
	}

	@Override
	public void meetYou() {
		phrase += " meet you.";
	}
}
