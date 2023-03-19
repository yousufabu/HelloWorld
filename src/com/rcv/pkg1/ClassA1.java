package com.rcv.pkg1;

public class ClassA1 {
	public static void main(String[] args) {
		ClassA1 c= new ClassA1();
		c.publicDemo();
	}

	public int publicDemo=1;
	int defaultDemo=2;
	private int privateDemo =3;
	protected int protectedDemo=4;
	
	public void publicDemo() {
		System.out.println("Print Public Demo");
		
	}
	private void privateDemo() {
		System.out.println("Pinrt Private Demo");
	}
	
	protected void protectedDemo() {
		System.out.println("Print Protected Demo");
	}
	
	void defaultDemo() {
		System.out.println("Print Dfault Demo");
	}
}
