import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(1, 'a');                 // 앞에서 2번째
        sb.setCharAt(sb.length() - 2, 'a');   // 뒤에서 2번째

        System.out.println(sb);
    }
}