package practice.singleton;

public class Main {
	
	public static void main(String[] args) {
		Ballondor b1 = Ballondor.getInstance();
		System.out.println(b1.getName());
		Ballondor b2 = Ballondor.getInstance();
		System.out.println(b2.getName());
		System.out.println(b1);
		System.out.println(b2);
//		Ballondor b2 = new Ballondor("음바페");
	}
	
}
