import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int N = sc.nextInt();

        int num = A;

        for (int i = 1; i <= N; i++) {
            num += N;
            System.out.println(num);
        }
    }
}