import java.util.Scanner;

public class ClientPage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List[] list = new List[10];
		boolean cnd = true;
		Scanner sc = new Scanner(System.in);
		String name, reason, id, pwd;
		int age;
		
		do {
			System.out.println("------------------------------------");
			System.out.println("1.환자정보 등록");
			System.out.println("2.로그인");
			System.out.println("3.환자 내원정보");
			System.out.println("4.전체환자정보");
			System.out.println("5.로그아웃");
			System.out.println("------------------------------------");
			System.out.print("번호 입력:");
			
			int menu = sc.nextInt();
			switch (menu) { 
			case 1: 
				System.out.print("id: ");
				id = sc.next(); 
				System.out.print("password: ");
				pwd = sc.next(); 
				System.out.print("환자 이름: ");
				name = sc.next(); 
				System.out.print("나이: ");
				age = sc.nextInt(); 
				System.out.print("방문 사유: ");
				reason = sc.next();
				
				list[List.count] = new List(id, pwd, name, age, reason); // 객체를 만들어서 list에 회원정보 넣기
				List.count++;
				System.out.println("정보 입력 완료되었습니다");
				break;
			case 2: 
				System.out.println("--로그인--");
				System.out.println("id: ");
				id = sc.next();
				System.out.println("pasword: ");
				pwd = sc.next();
				
				boolean isLogin=false;
				for(int i=0;i<List.count; i++) {
					if(id.equals(list[i].id)&& pwd.equals(list[i].pwd)) {
						System.out.println("로그인 성공");
						isLogin=true;
						break;
					}
				}
				if(!isLogin)
					System.out.println("로그인 실패");
				break;
			case 3: 
				System.out.println("--정보 찾기--");
				System.out.println("이름: ");
				name=sc.next();
				
				boolean isName=false;
				for(int i=0; i<List.count; i++) {
					if(name.equals(list[i].name)) {
						System.out.println("내원 사유: "+list[i].reason);
						isName=true;
						break;
					}
				}
				if(!isName)
					System.out.println(name+"님의 등록정보가 없습니다.");
				break;
			case 4:
				for (int i = 0; i < List.count; i++) {
					System.out.println(list[i]);
				}
				break;
			case 5: 
				cnd = false;
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			}
		} while (cnd);
		System.out.println("로그아웃");
	}
}