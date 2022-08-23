package me.java.inheritance;

import me.java.inheritance.abstraction.AbstractHelloA;
import me.java.inheritance.abstraction.HelloA;
import me.java.inheritance.implementation.HelloB;
import me.java.inheritance.implementation.InterfaceHelloB;

public class Client {
	public static void main(String[] args) {
		/**
		 * abstract
		 */
		AbstractHelloA helloA = new HelloA();
		((HelloA) helloA).sayHello();
		((HelloA) helloA).niceTo();
		((HelloA) helloA).meetYou();
		((HelloA) helloA).printPhrase();
	}
}
