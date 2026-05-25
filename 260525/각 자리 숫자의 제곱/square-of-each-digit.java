import java.util.Scanner;

public class Main {

    // 재귀 함수
    public static int sumSquare(int n) {
        // 종료 조건
        if (n == 0) {
            return 0;
        }

        int digit = n % 10; // 마지막 자리 숫자
        return digit * digit + sumSquare(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(sumSquare(N));
    }
}