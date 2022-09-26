package lamyeon;

public class App {
	
	public static void main(String[] args) {
		Lamyeon lamyeon = new JinLamyeonAdapter(new JinLamyeon());
		lamyeon.cook();
	}
	
}
