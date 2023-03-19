package com.rcv.pkg1;

public class ClassA {
	public static void main(String[] args) {
		ClassA ob= new ClassA();
		ob.privateMethod();
		ob.protectedMethod();
	}

	public int publicVariable = 1;
	int defaultVariable = 2;
	private int privateVariable = 3;
	protected int protectedVariable = 4;

	public void publicMethod() { 

		System.out.println("Public Method");
	}
	void defaultMethod() {
		System.out.println("default Method");
	}
	private void privateMethod() {
		System.out.println("private Method");
		
	}
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}

}
