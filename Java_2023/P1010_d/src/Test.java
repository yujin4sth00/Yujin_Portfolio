
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(); //car 객체 생성
		//클래스이름 변수 = new 생성자이름();
		Car c2 = new Car("blue");
		Car c3 = new Car(1000, "red");
		
		System.out.println("자동차 생산대수 : "+ Car.count); //static 변수
		c1.volUp();
		Car.doorOpen();
		
		//이름 출력 메소드
		printName();
		//자기 학번 출력 - 객체 생성 후 메소드 사용
		//static 사용하지 않을 때
		Test t = new Test();
		t.printNumber();
		
	}//main 끝
	static void printName() {
		System.out.println("ko");
	}
	void printNumber() {
		System.out.println("99999");
	}
}
