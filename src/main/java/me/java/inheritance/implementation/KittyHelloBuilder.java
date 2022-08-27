package me.java.inheritance.implementation;

public class KittyHelloBuilder implements Buildable {

	private final String name;

	private String phrase = "";

	public KittyHelloBuilder(String name) {
		this.name = name;
		sayHello();
		niceTo();
		meetYou();
	}

	@Override
	public void sayHello() {
		phrase += "안냥, \"" + name + "\" 이다냥.";
	}

	@Override
	public void niceTo() {
		phrase += " 반갑다냥.";
	}

	@Override
	public void meetYou() {
		phrase += " 또보자냥.";
	}

	@Override
	public String getPhrase() {
		return phrase;
	}
}
