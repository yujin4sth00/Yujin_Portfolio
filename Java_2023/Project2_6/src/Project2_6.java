import java.util.Scanner;

public class Project2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���Ϸ��� ������ ���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		int sum = 0;
		int count = 0;
		
		for (int i=0; i<=num; i++) {
			if(i%3 == 0) {
				if(count%5 ==0)
					System.out.println();
				sum += i;
				System.out.print(i + "\t");
				count++;
				
			}
		}
		System.out.println("\n0���� "+ num + "������ 3�� ��� �� : "+ sum);
	}

}
