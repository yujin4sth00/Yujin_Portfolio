// Car Ŭ���� = �ʵ�(Ŭ������ ����,Ư�� ��Ÿ��) + �޼ҵ�(Ŭ������ ���, ����)
public class Car {
	String color; //�ʵ�
	int price; //�ʵ�
	int vol; //�ʵ�
	static int count; //���귮 ����
	
	//������ �����ε�(������ ���� �� ����)
	Car() { count++; } //default ������(�ڵ� ������) ->�ּ�ó���ص� Car.java���� ������ �ȳ�
	
	public Car(String option) {
		color = option;
		count++;
	} //������
	public Car(int price, String opt) {count++;};
	
	void volUp(){//returnŸ�� ������ void �� �ۼ� //�ν��Ͻ� �޼ҵ�(=��ü�� �����߸� ��밡��)
		vol ++;
	}
	static void doorOpen() {
		System.out.println("�� ����");
	}
}

