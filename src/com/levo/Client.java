package com.levo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;

public class Client {
	
	static ClassLoader cl;
	static ServerIntf server;		// server interface
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		
		reloadServer();
		// endless loop for user input
		while(true) {
			System.out.println("Enter QUOTE, RELOAD or QUIT: ");
			
			String commandRead = br.readLine();
			String command = commandRead.toUpperCase();
			
			switch(command) {
				case "QUIT": {
					return;
				}
				
				case "QUOTE": {
					System.out.println(server.getQuote());
					break;
				}
				
				case "RELOAD": {
					reloadServer();
					break;
				}
				
				default: {
					;
				}
			}
		}
	}
	
	public static void reloadServer() throws Exception {
		String urlString = "file:./serverclass/";
		System.out.println(urlString);
		URL[] urls = new URL[]{new URL(urlString)};
		
		cl		= new URLClassLoader(urls);
		server	= (ServerIntf) cl.loadClass("com.levo.ServerImpl").newInstance();
	}
	
}
