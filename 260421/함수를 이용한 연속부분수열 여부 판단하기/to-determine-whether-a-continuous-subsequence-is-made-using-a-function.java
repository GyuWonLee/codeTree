import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int countA = sc.nextInt();
        int countB = sc.nextInt();
        
        int[] arrA = new int[countA];
        int[] arrB = new int[countB];
        
        // 1. 수열 A 입력 (0부터 countA-1까지)
        for(int i = 0; i < countA; i++) {
            arrA[i] = sc.nextInt();
        }
        
        // 2. 수열 B 입력 (0부터 countB-1까지)
        for(int i = 0; i < countB; i++) {
            arrB[i] = sc.nextInt();
        }
        
        if(isCondition(arrA, countA, arrB, countB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }

    static boolean isCondition(int[] arrA, int countA, int[] arrB, int countB) {
        if(countB > countA) return false;
        
        // 수열 A를 돌면서 수열 B가 시작될 수 있는 지점까지 확인
        for(int i = 0; i <= countA - countB; i++) {
            boolean isMatch = true;
            
            for(int j = 0; j < countB; j++) {
                // arrA의 현재 위치(i)에서 j만큼 이동하며 B와 비교
                if(arrA[i + j] != arrB[j]) {
                    isMatch = false;
                    break;
                }
            }
            if(isMatch) return true;
        }
        
        return false;
    }
}