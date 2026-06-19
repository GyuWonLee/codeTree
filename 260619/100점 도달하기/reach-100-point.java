import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = n; i <= 100; i++) {
            char grade;

            if (i >= 90) {
                grade = 'A';
            } else if (i >= 80) {
                grade = 'B';
            } else if (i >= 70) {
                grade = 'C';
            } else if (i >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            if (i > n) {
                sb.append(" ");
            }

            sb.append(grade);
        }

        System.out.print(sb);
    }
}