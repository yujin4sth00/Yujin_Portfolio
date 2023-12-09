//강의자료 37쪽 참고
public class P1107_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Animal aa = new Animal();
		Lion bb = new Lion();
		Animal ab = (Animal) new Lion(); //업캐스팅(Animal이 앞에 생략)
		//인스턴스 필드
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);//인스턴스 필드는 오버라이딩 x
	}

}
