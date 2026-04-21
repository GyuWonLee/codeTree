import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄: 정수 N 입력
        int n = sc.nextInt();

        // 두 번째 줄: N개의 정수 처리
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            // 짝수라면 2로 나눈 값을, 홀수라면 원래 값을 출력
            if (num % 2 == 0) {
                System.out.print((num / 2) + " ");
            } else {
                System.out.print(num + " ");
            }
        }
        
        sc.close();
    }
}