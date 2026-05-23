import java.util.Scanner;

public class Main {

    public static int sum(int n) {
        // 종료 조건
        if (n == 1) {
            return 1;
        }

        // 재귀 호출
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(sum(N));
    }
}