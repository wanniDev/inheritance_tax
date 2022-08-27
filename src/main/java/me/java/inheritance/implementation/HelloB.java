package me.java.inheritance.implementation;

public class HelloB implements Buildable, Printable {

	private String phrase;

	public HelloB() {
		this.phrase = "";
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

	@Override
	public void print(String phrase) {
		System.out.println(phrase);
	}
}
