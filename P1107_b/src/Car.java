
public class Car {
	//기본 생성자(default 생성자)
	Car(){
		System.out.println("Car 기본 생성자");
	}
	//생성자 옵션 존재
	Car(String color){
		System.out.println("Car 색상 옵션 존재");
	}
	Car(int price){
		System.out.println("Car 가격");
	}
}
