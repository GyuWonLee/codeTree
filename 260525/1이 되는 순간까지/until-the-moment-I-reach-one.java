import java.util.Scanner;

public class Main {

    // 재귀 함수
    public static int count(int n) {

        // 종료 조건
        if (n == 1) {
            return 0;
        }

        // 짝수이면 2로 나눔
        if (n % 2 == 0) {
            return 1 + count(n / 2);
        }

        // 홀수이면 3으로 나눈 몫
        return 1 + count(n / 3);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(count(N));
    }
}