package me.java.inheritance.implementation;

public class EnglishHelloBuilder implements Buildable {
	private String phrase;

	public EnglishHelloBuilder() {
		this.phrase = "";
		sayHello();
		niceTo();
		meetYou();
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

	@Override
	public String getPhrase() {
		return phrase;
	}
}
