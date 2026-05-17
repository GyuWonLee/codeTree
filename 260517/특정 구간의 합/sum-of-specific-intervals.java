import java.util.Scanner;

public class Main {

    // 전역변수
    static int[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        A = new int[N];

        // 수열 입력
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // M번 질문
        for (int i = 0; i < M; i++) {

            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            int sum = 0;

            // a1번째 ~ a2번째 합
            for (int j = a1 - 1; j <= a2 - 1; j++) {
                sum += A[j];
            }

            System.out.println(sum);
        }
    }
}