import java.util.Scanner;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] list = new User[10];
		boolean cnd = true;
		Scanner sc = new Scanner(System.in);
		String id;
		String pwd;

		do {
			System.out.println("------------------------------------");
			System.out.println("1.ȸ�����(Sign up)");
			System.out.println("2.�α���(Login)");
			System.out.println("3.ȸ�����(Print)");
			System.out.println("4.����(Exit)");
			System.out.println("------------------------------------");
			System.out.print("��ȣ �Է�:");
			int menu = sc.nextInt(); // �޴� ��ȣ

			switch (menu) {
			case 1: // ȸ�����
				System.out.print("���̵�: ");
				id = sc.next(); // ���̵� �Է�
				System.out.print("��й�ȣ: ");
				pwd = sc.next(); // ��� �Է�
				list[User.count] = new User(id, pwd); // ��ü�� ���� list�� �ֱ�
				// User.java�� �ι�° �����ڰ� ���ư��� ��
				User.count++;
				break;
			case 2: // �α���
				System.out.println("** �α��� **");
				System.out.print("id �Է�:");
				id = sc.next();
				System.out.println("pwd �Է�: ");
				pwd = sc.next();
				
				boolean isLogin = false;//���� �������־� �α��� ���� �� if���� ��ӵ����� �ֵ����ϱ�
				for(int i=0;i<User.count; i++) {
					if(id.equals(list[i].userid) && pwd.equals(list[i].pwd)) {//�α���
						System.out.println("�α��� ����");
						isLogin = true;
						break;
					}
				}
				if(!isLogin)
					System.out.println("�α��� ����");
				break;
			case 3: // ���
				for (int i = 0; i < User.count; i++) {
					//System.out.println("id: "+list[i].userid + " , pwd: " + list[i].pwd);
					System.out.println(list[i]);
				}
				break;
			case 4:
				cnd = false;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
				break;
			}
		} while (cnd);
		System.out.println("���α׷� ����");
	}
}
