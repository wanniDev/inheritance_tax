package me.java.inheritance.abstraction;

public abstract class AbstractHelloA {
	abstract void sayHello();
	abstract void niceTo();
	abstract void meetYou();
	abstract void printPhrase();

	public void buildPhraseAndPrint() {
		sayHello();
		niceTo();
		meetYou();
		printPhrase();
	};
}
