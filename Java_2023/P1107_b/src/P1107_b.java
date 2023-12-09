
public class P1107_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car c1 = new 생성자이름();
		Car c1 = new Car();
		Car c2 = new Car("red");
		Car c3 = new Car(1000);
		
		
		//클래스 이름으로 바로 접근
		System.out.println(A.m);
		System.out.println(B.m);
		
		A aa = new A();
		B bb = new B();
		A ab = new B();//업캐스팅
		
		//객체 생성을 통한 static 필드
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m); //오버라이딩x(부모의 값)
		
		//static 메서드
		ab.print(); //오버라이딩 x
		//instance 메서드
		ab.ins_print(); //오버라이딩o-> 자식 것이 돌아감
		((A) ab).ins_print(); //ab의 본질은 A 클래스
	}
}
