import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		String name=scanner.nextLine();
		System.out.print("���̸� �Է��Ͻÿ�: ");
		int age=scanner.nextInt();
		
		System.out.println(name+ "�� �ȳ��ϼ���! "+ age+ "���̽ó׿�.");
	}

}
