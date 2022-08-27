package me.java.inheritance.implementation;

public class HelloB implements Buildable, Printable {

	private String phrase;

	public HelloB() {
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

	@Override
	public String getPhrase() {
		return phrase;
	}

	@Override
	public void print(String phrase) {
		sayHello();
		niceTo();
		meetYou();
		System.out.println(phrase);
	}
}
