package proxy;

public class BlogServer implements Server {
	
	@Override
	public void request() {
//		System.out.println("json을 java 오브젝트로");
		System.out.println("요청을 받음");
//		System.out.println("java 오브젝트를 json으로");
	}
}
