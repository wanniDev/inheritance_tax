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
	public void printPhrase() {
		sayHello();
		niceTo();
		meetYou();
		System.out.println(phrase);
	}
}
