import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int count = 0; // 온전수가 아닌 수를 세는 변수
        
        for (int i = A; i <= B; i++) {
            // 2의 배수이거나, 일의 자리가 5이거나, (3의 배수이면서 9의 배수가 아닌 수)
            // 위 조건 중 하나라도 만족하면 '온전수가 아님'
            if (i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)) {
                // 이 조건에 해당하면 온전수가 아니므로 count (제외할 숫자)
                continue; 
            } else {
                // 온전수라면 개수를 셈
                count++;
            }
        }
        System.out.println(count);
    }
}