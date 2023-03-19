package com.rcv.pkg1;

public class Circle extends Shapes {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.colorShape();
		c.moveShape();
		c.drawShape();
	}

	@Override
	public void drawShape() {
		System.out.println("Draw shape");
		
	}

	@Override
	public void colorShape() {
		System.out.println("Color shape");
		
	}

	@Override
	public void moveShape() {
	System.out.println("Move shape");
	}

}
