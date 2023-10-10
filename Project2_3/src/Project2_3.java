import java.util.Scanner;

public class Project2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equals() : String 비교
		//if(str1.equals(str2)) -> o
		//﻿if(str1 == str2) -> x
		double num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력: ");
		String a = sc.nextLine();
		System.out.print("첫 번째 숫자 입력: ");
		num1 = sc.nextDouble();
		System.out.print("두 번째 숫자 입력: ");
		num2 = sc.nextDouble();
		
		if(a.equals("+"))
			System.out.println(num1+num2);
		else if(a.equals("-"))
			System.out.println(num1-num2);
		else if(a.equals("*"))
			System.out.println(num1*num2);
		else
			System.out.println(num1/num2);
	}

}
