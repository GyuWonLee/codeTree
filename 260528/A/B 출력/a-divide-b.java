import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        BigDecimal result = new BigDecimal(A)
                .divide(new BigDecimal(B), 20, RoundingMode.DOWN);

        System.out.println(result);
    }
}