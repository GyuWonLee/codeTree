import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = 0;
		int r2 = 0;

		if (a < b) {
			r = b + 25;
			r2 = a * 2;
		} else {
			r = a + 25;
			r2 = b * 2;
		}

		System.out.println(r2 + " " + r);
	}
}
