import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
    
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }
        // 결과를 출력하는 코드가 꼭 필요합니다!
        System.out.println(sum);
        
        sc.close();
    }

    static boolean isPrime(int n) {
        if(n < 2) return false;
        
        for(int i = 2; i * i <= n; i++) {
            if(n % i == 0) return false;
        }
        
        // for문이 끝까지 다 돌았다는 건, 소수라는 뜻입니다.
        return true; 
    }
}
