package polymorphismPKG;

public class CompileTime {

	public static void main(String[] args) {
		CompileTime load = new CompileTime();
		load.login(212203, "password");
		load.login("user", 1234);
		

	}
	public void login(String s, int i) {
		System.out.println("loging successfully by using username and 0-9-Password");
	}
	public void login(int i, String s) {
		System.out.println("loging successfully by using Phone number and a-z-Password");
	}

}
