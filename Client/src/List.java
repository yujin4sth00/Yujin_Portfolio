
public class List {
	String id, pwd, name, reason;
	int age; 
	static int count;
	
	List(String id, String pwd, String name, int age, String reason){
		this.id=id;
		this.pwd=pwd;
		this.name=name;
		this.age=age;
		this.reason=reason;
	}
	public String toString() {
		return "이름: " + this.name  +" 나이: " + this.age+" 사유: " +this.reason;
	}
}
