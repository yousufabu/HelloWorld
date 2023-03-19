package inheritancePKG;

public class ModelA extends TeslaVhicle{
	// I have extend TeslaVhicle in ModelA class
	//This ModelA class is child class of TeslaVhicle
	public static void main(String[] args) {
		// this is called single inheritance
		ModelA A1 = new ModelA();
		A1.start();
		A1.stop();
		
	}
	public void loadCapacity() {
		// This load capacity is for ModelA
		System.out.println("Model__ loadCapacity");
	}

}
