import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            // 앞 공백 출력: 줄이 내려갈수록 2칸씩 증가
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }

            // 별 출력: 2 * N - 1개부터 시작해서 2개씩 감소
            for (int j = 0; j < 2 * (N - i) - 1; j++) {
                System.out.print("*");

                // 별 사이에만 공백 출력
                if (j != 2 * (N - i) - 2) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}