package EnacapsulationPKG;

public class UseEncaplulation {

	public static void main(String[] args) {
		Encapsulation cap = new Encapsulation();
//		int h = cap.height = 10;
//		int l = cap.length = 20;
//		int w = cap.width = 30;
//		cap.setDiamention(l, w, h);
//		cap.setLength(l);
//		cap.setLength(4);
		int a= cap.setHeight(11);
		int b= cap.setLength(12);
		int c= cap.setWedth(13);
		
		//cap.setDiamention(a, b, c);
		System.out.println(cap.getLength());
		System.out.println(cap.gettHeight());
		System.out.println(cap.getWedth());
	}

}
