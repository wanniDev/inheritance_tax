package me.java.inheritance.implementation;

public class KoreanHelloBuilder implements Buildable {
	private String phrase;

	public KoreanHelloBuilder() {
		this.phrase = "";
	}

	@Override
	public void sayHello() {
		phrase += this.getClass().getSimpleName() + "로부터 온 인삿말입니다.";
	}

	@Override
	public void niceTo() {
		phrase += " 반갑다고 하네요.";
	}

	@Override
	public void meetYou() {
		phrase += " 그렇다고 하네요.";
	}

	@Override
	public String getPhrase() {
		return phrase;
	}
}
