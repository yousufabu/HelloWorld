package com.rcv.pkg1;

public class Common {
	
	
	private int length;
	private int width;
	private int heights;
	
	public void setDiamontion(int l, int w, int h) {
		if (l>1 && h>1 && w>1) {
			System.out.println("Box created with diamantion " + l +" " + w +" " + h );
		}
		else {
			System.out.println(" Invalid diamantion");
		}
		
	}
	
	public int setheights(int h) {
		 heights = h;
		 if (h>1) {
			 System.out.println("This is the right heights");
		 }
		 else {
			 System.out.println("Heights is invalid");
		 }
		return heights;
	}
	
	public int setlength(int l) {
		length =l;
		return length;
	}
	 public int setwidth(int w) {
		 width = w;
		 return width;
	 }
	
	public int getheights() {
	
		return heights;
	}
	public int getlength() {
		return length;
	}
	public int getwidth() {
		return width;
	}
}
