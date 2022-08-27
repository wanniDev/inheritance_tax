package me.java.inheritance.implementation;

public class KittyHelloBuilder implements Buildable {

	private final String name;

	private String phrase = "";

	public KittyHelloBuilder(String name) {
		this.name = name;
		build();
	}

	private void sayHello() {
		phrase += "안냥, \"" + name + "\" 이다냥.";
	}

	private void niceTo() {
		phrase += " 반갑다냥.";
	}

	private void meetYou() {
		phrase += " 또보자냥.";
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
