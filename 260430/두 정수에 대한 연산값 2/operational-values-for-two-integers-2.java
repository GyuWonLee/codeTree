import java.util.Scanner;

public class Main {
	static int a;
	static int b;
	
	public static void modify() {
		if(a < b) {
			a = a + 10;
			b = b * 2;
		} else {
			a = a * 2;
			b = b + 10;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();
		b = sc.nextInt();
		
		modify();
		
		System.out.println(a + " " + b);
	
	}
}
