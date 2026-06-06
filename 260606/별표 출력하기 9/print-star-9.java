import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // 앞 공백 출력
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
                if (j < 2 * i - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}