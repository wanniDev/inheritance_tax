package me.java.inheritance.implementation;

public class EnglishHelloBuilder implements Buildable {
	private String phrase;

	public EnglishHelloBuilder() {
		this.phrase = "";
		build();
	}

	public void sayHello() {
		phrase += "Hello from " + this.getClass().getSimpleName();
	}

	public void niceTo() {
		phrase += " and say nice to";
	}

	public void meetYou() {
		phrase += " meet you.";
	}

	@Override
	public void build() {
		sayHello();
		niceTo();
		meetYou();
	}

	@Override
	public String getPhrase() {
		return phrase;
	}
}
