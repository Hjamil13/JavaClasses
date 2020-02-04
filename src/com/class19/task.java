package com.class19;

public class task {
	String createEmail(String userName,String lastName,String emailType) {
		String Email;
		Email=(userName+lastName+emailType);
		
			return Email;
		}
	public static void main(String[] args) {
	
	task obj=new task();
	String Email=obj.createEmail("Jhon" ,"Tom" ,"@ Gmail.com");
	System.out.println(Email);
	}}
	

	


