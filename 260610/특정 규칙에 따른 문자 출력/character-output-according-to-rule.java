import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 위쪽 부분: @ 개수가 1개부터 N개까지 증가
        for (int i = 1; i <= N; i++) {
            // 앞 공백 출력
            for (int j = 0; j < N - i; j++) {
                System.out.print("  ");
            }

            // @ 출력
            for (int j = 0; j < i; j++) {
                if (j == i - 1) {
                    System.out.print("@");
                } else {
                    System.out.print("@ ");
                }
            }

            System.out.println();
        }

        // 아래쪽 부분: @ 개수가 N-1개부터 1개까지 감소
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (j == i - 1) {
                    System.out.print("@");
                } else {
                    System.out.print("@ ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}