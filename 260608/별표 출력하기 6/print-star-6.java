import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 위쪽 + 가운데
        for (int i = 0; i < N; i++) {
            // 앞 공백: 0, 2, 4 ...
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // 별 개수: 2*N-1, 2*N-3, ..., 1
            int starCount = 2 * (N - i) - 1;

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");

                // 별 사이 공백
                if (j < starCount - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // 아래쪽
        for (int i = N - 2; i >= 0; i--) {
            // 앞 공백
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // 별 개수
            int starCount = 2 * (N - i) - 1;

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");

                // 별 사이 공백
                if (j < starCount - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}