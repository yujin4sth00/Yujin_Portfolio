import java.util.Scanner;

public class Project2_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c, max; 
		
		System.out.println("ù��° ���� �Է�: ");
		a=sc.nextInt(); //���� �� int���� �ϹǷ� ���� ������ ���ذ�(Line7)
		System.out.println("�ι�° ���� �Է�: ");
		b=sc.nextInt();
		System.out.println("����° ���� �Է�: ");
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
