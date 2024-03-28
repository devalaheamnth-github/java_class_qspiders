package com.gmail.inbox;

public class InboxSpam {
	public void read()
	{
		System.out.println("message has been read in spam");
	}
	public void deleteSpam()
	{
		System.out.println("message has been deleted in spam");
	}
	
	public static void main(String[] args) {
		InboxSpam iS = new InboxSpam();
		iS.read();
		iS.deleteSpam();
	}
}
