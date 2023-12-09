
public class B extends A{
	B(){
		//super(); //자동 삽입 - 부모 생성자 호출
		System.out.println("B-기본생성자");
	}
	B(int a){
		System.out.println("B(int)-생성자");
	}
}
