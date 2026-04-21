import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int D = sc.nextInt();
		
		String result = checkDate(M, D);
		System.out.println(result);
	}

	static String checkDate(int m, int d) {
		int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(m < 1 || m > 12) {
			return "No";
		}
		
		if(d < 1 || d > dayInMonth[m-1]) {
			return "No";
		}
		
		return "Yes";
	}
}
