package me.java.inheritance;

import me.java.inheritance.abstraction.AbstractHelloA;
import me.java.inheritance.abstraction.HelloA;
import me.java.inheritance.implementation.HelloB;

public class Client {
	public static void main(String[] args) {
		/**
		 * abstract
		 */
		AbstractHelloA helloA = new HelloA();
		((HelloA) helloA).buildPhraseAndPrint();

		/**
		 * interface
		 */
		HelloB helloB = new HelloB();
		helloB.printPhrase();
	}
}
