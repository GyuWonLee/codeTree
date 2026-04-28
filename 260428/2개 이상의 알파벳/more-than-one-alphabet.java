import java.util.Scanner;

public class Main {

	public static boolean isDifferent(String A) {
		for (int i = 0; i < A.length(); i++) {
			for (int j = i + 1; j < A.length(); j++) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		if (isDifferent(A)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");

		}
	}
}
