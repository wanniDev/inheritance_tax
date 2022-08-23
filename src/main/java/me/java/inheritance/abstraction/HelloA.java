package me.java.inheritance.abstraction;

public class HelloA extends AbstractHelloA {

	private String phrase;

	public HelloA() {
		this.phrase = "";
	}

	@Override
	protected void sayHello() {
		phrase += "Hello from " + this.getClass().getSimpleName();
	}

	@Override
	protected void niceTo() {
		phrase += " and say nice to";
	}

	@Override
	protected void meetYou() {
		phrase += " meet you.";
	}

	@Override
	protected void printPhrase() {
		System.out.println(phrase);
	}
}
