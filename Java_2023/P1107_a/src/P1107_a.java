//�����ڷ� 37�� ����
public class P1107_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü ����
		Animal aa = new Animal();
		Lion bb = new Lion();
		Animal ab = (Animal) new Lion(); //��ĳ����(Animal�� �տ� ����)
		//�ν��Ͻ� �ʵ�
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);//�ν��Ͻ� �ʵ�� �������̵� x
	}

}
