
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(); //car ��ü ����
		//Ŭ�����̸� ���� = new �������̸�();
		Car c2 = new Car("blue");
		Car c3 = new Car(1000, "red");
		
		System.out.println("�ڵ��� ������ : "+ Car.count); //static ����
		c1.volUp();
		Car.doorOpen();
		
		//�̸� ��� �޼ҵ�
		printName();
		//�ڱ� �й� ��� - ��ü ���� �� �޼ҵ� ���
		//static ������� ���� ��
		Test t = new Test();
		t.printNumber();
		
	}//main ��
	static void printName() {
		System.out.println("ko");
	}
	void printNumber() {
		System.out.println("99999");
	}
}
