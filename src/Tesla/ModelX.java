package Tesla;

public class ModelX {
	String color, brand, type;
	int numOfWheels;
	
	public void setInfo(String c, String b, String t, int w) {
		color =c;
		brand= b;
		type =t;
		numOfWheels =w;
	}
	public void displayInfo() {
		System.out.println("Color: "+ color );
		System.out.println("Brand: "+ brand );
		System.out.println("Type: "+ type );
		System.out.println("NumOfWheels: "+ numOfWheels );
	}
}
