package practice.singleton;

public class Ballondor {
	
	private static final String NAME = "네이마르";
	
	private static Ballondor instance = new Ballondor(NAME);
	
	public String getName() {
		return NAME;
	}
	
	public static Ballondor getInstance() {
		return instance;
	}
	
	private Ballondor(String name) {
		
	}
}
