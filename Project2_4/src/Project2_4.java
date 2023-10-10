import java.util.Scanner;

public class Project2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c, max; 
		
		System.out.println("첫번째 숫자 입력: ");
		a=sc.nextInt(); //양쪽 다 int여야 하므로 위에 선언을 해준것(Line7)
		System.out.println("두번째 숫자 입력: ");
		b=sc.nextInt();
		System.out.println("세번째 숫자 입력: ");
		c=sc.nextInt();
		
		max=a;
		
		if(a<b) {
			max=b;
			if(b<c)
				max=c;
			else
				max=b;
		}else {
			if(a<c)
				max=c;
		}
		System.out.println("max: "+ max);
	}

}
