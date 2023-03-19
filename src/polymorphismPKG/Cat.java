package polymorphismPKG;

public class Cat extends Animal_RunTime{

	public static void main(String[] args) {
		Cat cat = new Cat(); 
		cat.animalMakeNoic(); // this is from Cat class
		cat.animalMakeNoice();// this is from Animal_RunTime class
	}
	public void animalMakeNoic() {
		System.out.println("Cat sunds Meew... Meew...");
	}
	
	
}
