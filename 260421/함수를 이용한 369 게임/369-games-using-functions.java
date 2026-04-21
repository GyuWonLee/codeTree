import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int count = 0;
		for(int i = A; i <= B; i++) {
			if(condition(i)) {
				count++;
			}
		}
        System.out.println(count);
	}

	private static boolean condition(int i) {
		// 1. 3의 배수인지 확인 (6, 9도 포함됨)
		if(i % 3 == 0) return true;
		
		// 369 가 들어있는지 확인,,
		int temp = i;
		while(temp > 0) {
			int digit = temp % 10;
			if(digit == 3 || digit == 6 || digit == 9) {
				return true;
			}
			temp /= 10;
		}
		
		return false;
	}
}
