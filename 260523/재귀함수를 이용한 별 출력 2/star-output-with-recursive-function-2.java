import java.util.Scanner;

public class Main {
    public static void printStars(int n) {
        if (n == 0) return;

        printLine(n);      // 내려가면서 출력
        printStars(n - 1); // 재귀 호출
        printLine(n);      // 올라오면서 출력
    }

    public static void printLine(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }

        System.out.print("* ");
        printLine(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printStars(n);
    }
}