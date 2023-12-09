
public class User {
	//1.필드 선언
	String userid, pwd; //아이디, 비번
	static int count; //User 객체 생성 개수
	//2.생성자, 메소드
	User(){} //기본 default 생성자
	User(String userid, String pwd){
		this.userid = userid; //앞의 userid는 필드 선언때의 userid,
		        //뒤는 파라메터로 받는 값이므로 this 써주기(노란 오류라서 상관x 하지만
		        //헷갈릴 수 있기 때문에)
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "id: " + this.userid + ", " +"pwd: " + this.pwd;
	}
}
