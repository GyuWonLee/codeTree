import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. N과 M 입력
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 2. 수열 A 입력
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 3. 함수 호출 및 결과 출력
        System.out.println(calculateSum(a, m));
        
        sc.close();
    }

    /**
     * 문제의 조건에 따라 M을 변환하며 수열의 합을 구하는 함수
     */
    public static int calculateSum(int[] arr, int m) {
        int total = 0;

        while (true) {
            // 현재 M번째 원소를 더함 (인덱스는 m - 1)
            total += arr[m - 1];

            // M이 1이 되면 반복 종료
            if (m == 1) {
                break;
            }

            // M이 홀수면 1을 빼고, 짝수면 2로 나눔
            if (m % 2 != 0) {
                m -= 1;
            } else {
                m /= 2;
            }
        }

        return total;
    }
}