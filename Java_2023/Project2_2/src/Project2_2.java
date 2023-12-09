
public class Project2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		for(i=1; i<=100; i++) {
			if (i%3==0 || i%4==0) {
				sum += i;
			}
		}
		System.out.println("гу: "+sum);
	}
}
