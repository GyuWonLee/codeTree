import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        repeatHelloWorld(n);
    }

    // 재귀 함수
    public static void repeatHelloWorld(int n) {

        // 종료 조건
        if (n == 0) {
            return;
        }

        System.out.println("HelloWorld");

        // 재귀 호출
        repeatHelloWorld(n - 1);
    }
}