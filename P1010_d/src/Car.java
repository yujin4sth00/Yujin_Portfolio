// Car 클래스 = 필드(클래스의 성질,특성 나타냄) + 메소드(클래스의 기능, 동작)
public class Car {
	String color; //필드
	int price; //필드
	int vol; //필드
	static int count; //생산량 변수
	
	//생성자 오버로딩(생성자 여러 개 생성)
	Car() { count++; } //default 생성자(자동 생성됨) ->주석처리해도 Car.java에서 오류가 안남
	
	public Car(String option) {
		color = option;
		count++;
	} //생성자
	public Car(int price, String opt) {count++;};
	
	void volUp(){//return타입 없으면 void 만 작성 //인스턴스 메소드(=객체를 만들어야만 사용가능)
		vol ++;
	}
	static void doorOpen() {
		System.out.println("문 열림");
	}
}

