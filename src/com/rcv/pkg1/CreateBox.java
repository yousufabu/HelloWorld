package com.rcv.pkg1;

public class CreateBox {

	public static void main(String[] args) {
		
		Common cm= new Common();
	
		int h = cm.setheights(1);
		int l = cm.setlength(20);
		int w = cm.setwidth(30);
		
	//cm.setDiamontion(l, w, h);
	System.out.println(cm.getheights());
	
	
	

	}

}
