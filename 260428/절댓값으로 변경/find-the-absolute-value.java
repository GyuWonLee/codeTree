import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int arr[] = new int[N];
        int result[] = new int[N];
        
        for(int i = 0; i < N; i++) {
        	arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; i++) {
        	result[i] = Math.abs(arr[i]);
        }
        
        for(int i = 0; i < N; i++) {
        	System.out.print(result[i] + " ");
        }
        
    }
}