//java.lang ��Ű�� �ȿ� ����

import java.util.Scanner;

public class Project2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = (int)Math.random();// �Ǽ�����(0<=x<1)
//		System.out.println(num1);
		//�ζǼ��� �߻�(1~45)
//		int num2 = (int) (Math.random()*45+1);
//		System.out.println(num2);
		
		int answer = (int)(Math.random()*10);//0~9
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("�����ϴ� �� �Է�: ");
			num = sc.nextInt();
			if(num < answer) {
				System.out.println("HIGH ");
			}
			if (num > answer) {
				System.out.println("LOW");
			}
		}while(num != answer);
			System.out.println("��: " +answer);
	}

}
