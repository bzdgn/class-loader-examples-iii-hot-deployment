package com.levo;

public class ServerImpl implements ServerIntf {
	
	private static final String quote1 = "How can a server serve for you, if you don't know what you want ?";
	private static final String quote2 = "I feel I'm renewed, How are you ?";
	
	@Override
	public String getQuote() {
		return quote2;
	}

}
