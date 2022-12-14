package adapter.ex01;

// 고객의 클레임이 들어오면
// 사과 이메일 보내기
// 이메일 답장을 DB 저장하기
public class CustomerService {
	
	//private Email email;
	private EmailSend email;
	
	public CustomerService(EmailSend email) {
		this.email = email;
	}

	public void acceptClaim(String msg) {
		String acceptMsg = msg;
		System.out.println("클레임 내용 : " + acceptMsg);
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 DB에 저장했습니다 : " + result);
	}
	
}
