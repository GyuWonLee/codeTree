import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int maxVal = Math.max(a, b);
        int minVal = Math.min(a, b);

        int r = maxVal + 25;
        int r2 = minVal * 2;

        System.out.println(r2 + " " + r);
    }
}