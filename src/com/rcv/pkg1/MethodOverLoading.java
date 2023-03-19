package com.rcv.pkg1;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading mo=new MethodOverLoading();
		mo.login(1, "abcd");
		mo.login("hi", "hello");
		mo.login(3, "what", 10);
		

	}
	public void login(String s, String p) {
		System.out.println("Login successfully by using username and password");
	}
	
	public void login(int s, String p){
		System.out.println("login successfully by using PhoneNumber and password");
	}
	
	public void login(int s, String p, int t) {
		System.out.println("login successfully by using PhoneNumber/pin and password");
	}

}
