
public class User {
	//1.�ʵ� ����
	String userid, pwd; //���̵�, ���
	static int count; //User ��ü ���� ����
	//2.������, �޼ҵ�
	User(){} //�⺻ default ������
	User(String userid, String pwd){
		this.userid = userid; //���� userid�� �ʵ� ������ userid,
		        //�ڴ� �Ķ���ͷ� �޴� ���̹Ƿ� this ���ֱ�(��� ������ ���x ������
		        //�򰥸� �� �ֱ� ������)
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "id: " + this.userid + ", " +"pwd: " + this.pwd;
	}
}
