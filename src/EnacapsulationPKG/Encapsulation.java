package EnacapsulationPKG;

public class Encapsulation {

	
		int length =10;
		int width =11;
		int height =13;
	
		public void setDiamention(int l, int w, int h) {
			System.out.println("box created " +l+" " + " "+w +" "+h);
			
		}
		//these are set methods
		public int setLength(int l) {
			if (l<=0) {
				length =l;
			}
			else {
				System.out.println("invalid Length");
			}
			//System.out.println("Length=" +length );
			return length;
			
		}
		public int setWedth(int w) {
			width =w;
			return width;
		}
		
		public int setHeight(int h) {
		
			height =h;
			return height;
		}
		//these are set methods
		public int getLength() {
			
			return length;
		}
		public int getWedth() {
			
			return width;
		}
		public int gettHeight() {
			
			return height;
		}
}
