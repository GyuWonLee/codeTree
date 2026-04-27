import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String A = sc.next();
		
		StringBuilder sb = new StringBuilder(A);
		
		String re = sb.reverse().toString();
		
		boolean ispalindrome = A.equals(re);
		
		if(ispalindrome) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
