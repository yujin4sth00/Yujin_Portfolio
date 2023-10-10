//java.lang 패키지 안에 존재

import java.util.Scanner;

public class Project2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = (int)Math.random();// 실수난수(0<=x<1)
//		System.out.println(num1);
		//로또숫자 발생(1~45)
//		int num2 = (int) (Math.random()*45+1);
//		System.out.println(num2);
		
		int answer = (int)(Math.random()*10);//0~9
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("예측하는 수 입력: ");
			num = sc.nextInt();
			if(num < answer) {
				System.out.println("HIGH ");
			}
			if (num > answer) {
				System.out.println("LOW");
			}
		}while(num != answer);
			System.out.println("답: " +answer);
	}

}
