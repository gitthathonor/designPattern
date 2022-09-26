package singleton;

public class App {

	public static void main(String[] args) {
		
		// 객체를 하나만 유지하는 방법 - 싱글톤
		President p1 = President.getInstance();
		President p2 = President.getInstance();
		System.out.println(p1);
		System.out.println(p2);
	}
}
