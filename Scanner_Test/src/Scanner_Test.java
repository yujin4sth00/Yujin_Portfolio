import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		scanner.nextLine(); //버퍼 비우기
		String addr = scanner.nextLine();
		int age = scanner.nextInt();
		double weight = scanner.nextDouble();
		
		System.out.println("name: " +name);
		System.out.println("addr: " +addr);
		System.out.println("age: " +age+ "살");
		System.out.println("weigth: " +weight+"kg");
	}

}
