import java.util.Scanner;

public class ClientPage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List[] list = new List[10];
		boolean cnd = true;
		Scanner sc = new Scanner(System.in);
		String name, reason, id, pwd;
		int age;
		
		do {
			System.out.println("------------------------------------");
			System.out.println("1.ȯ������ ���");
			System.out.println("2.�α���");
			System.out.println("3.ȯ�� ��������");
			System.out.println("4.��üȯ������");
			System.out.println("5.�α׾ƿ�");
			System.out.println("------------------------------------");
			System.out.print("��ȣ �Է�:");
			
			int menu = sc.nextInt();
			switch (menu) { 
			case 1: 
				System.out.print("id: ");
				id = sc.next(); 
				System.out.print("password: ");
				pwd = sc.next(); 
				System.out.print("ȯ�� �̸�: ");
				name = sc.next(); 
				System.out.print("����: ");
				age = sc.nextInt(); 
				System.out.print("�湮 ����: ");
				reason = sc.next();
				
				list[List.count] = new List(id, pwd, name, age, reason); // ��ü�� ���� list�� ȸ������ �ֱ�
				List.count++;
				System.out.println("���� �Է� �Ϸ�Ǿ����ϴ�");
				break;
			case 2: 
				System.out.println("--�α���--");
				System.out.println("id: ");
				id = sc.next();
				System.out.println("pasword: ");
				pwd = sc.next();
				
				boolean isLogin=false;
				for(int i=0;i<List.count; i++) {
					if(id.equals(list[i].id)&& pwd.equals(list[i].pwd)) {
						System.out.println("�α��� ����");
						isLogin=true;
						break;
					}
				}
				if(!isLogin)
					System.out.println("�α��� ����");
				break;
			case 3: 
				System.out.println("--���� ã��--");
				System.out.println("�̸�: ");
				name=sc.next();
				
				boolean isName=false;
				for(int i=0; i<List.count; i++) {
					if(name.equals(list[i].name)) {
						System.out.println("���� ����: "+list[i].reason);
						isName=true;
						break;
					}
				}
				if(!isName)
					System.out.println(name+"���� ��������� �����ϴ�.");
				break;
			case 4:
				for (int i = 0; i < List.count; i++) {
					System.out.println(list[i]);
				}
				break;
			case 5: 
				cnd = false;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
				break;
			}
		} while (cnd);
		System.out.println("�α׾ƿ�");
	}
}