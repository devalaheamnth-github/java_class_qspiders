package com.gmail.inbox;

public class InboxMail {
	
	public void send()
	{
		System.out.println("message has been send");
	}
	
	public void read()
	{
		System.out.println("mesage has been read");
	}
	
	public static void main(String[] args) {
		InboxMail iM = new InboxMail();
		iM.read();
		iM.send();
		
		
		InboxSpam iS = new InboxSpam();
		iS.read();
		iS.deleteSpam();
	}

}
