import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] list = new User[10];
		boolean cnd = true;
		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;

		do {
			System.out.println("------------------------------------");
			System.out.println("1.회원등록(Sign up)");
			System.out.println("2.로그인(Login)");
			System.out.println("3.회원출력(Print)");
			System.out.println("4.종료(Exit)");
			System.out.println("------------------------------------");
			System.out.print("번호 입력:");
			int menu = sc.nextInt(); // 메뉴 번호

			switch (menu) {
			case 1: // 회원등록
				System.out.print("아이디: ");
				id = sc.next(); // 아이디 입력
				System.out.print("비밀번호: ");
				pwd = sc.next(); // 비번 입력
				list[User.count] = new User(id, pwd); // 객체를 만들어서 list에 넣기
				// User.java의 두번째 생성자가 돌아가게 됨
				User.count++;
				break;
			case 2: // 로그인
				System.out.println("** 로그인 **");
				System.out.print("id 입력:");
				id = sc.next();
				System.out.println("pwd 입력: ");
				pwd = sc.next();
				
				boolean isLogin = false;//변수 설정해주어 로그인 실패 시 if문을 계속돌릴수 있도록하기
				for(int i=0;i<User.count; i++) {
					if(id.equals(list[i].userid) && pwd.equals(list[i].pwd)) {//로그인
						System.out.println("로그인 성공");
						isLogin = true;
						break;
					}
				}
				if(!isLogin)
					System.out.println("로그인 실패");
				break;
			case 3: // 출력
				for (int i = 0; i < User.count; i++) {
					//System.out.println("id: "+list[i].userid + " , pwd: " + list[i].pwd);
					System.out.println(list[i]);
				}
				break;
			case 4:
				cnd = false;
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		} while (cnd);
		System.out.println("프로그램 종료");
	}
}
