
public class P1107_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Car c1 = new �������̸�();
		Car c1 = new Car();
		Car c2 = new Car("red");
		Car c3 = new Car(1000);
		
		
		//Ŭ���� �̸����� �ٷ� ����
		System.out.println(A.m);
		System.out.println(B.m);
		
		A aa = new A();
		B bb = new B();
		A ab = new B();//��ĳ����
		
		//��ü ������ ���� static �ʵ�
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m); //�������̵�x(�θ��� ��)
		
		//static �޼���
		ab.print(); //�������̵� x
		//instance �޼���
		ab.ins_print(); //�������̵�o-> �ڽ� ���� ���ư�
		((A) ab).ins_print(); //ab�� ������ A Ŭ����
	}
}
