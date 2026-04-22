import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr1[][] = new int[3][3];
		int arr2[][] = new int[3][3];

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}

		for(int k = 0; k < 3; k++) {
			for(int l = 0; l < 3; l++) {
				arr2[k][l] = sc.nextInt();
			}
		}
		
		int s = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				s = arr1[i][j] *= arr2[i][j];
				System.out.print(s + " ");
			}
			System.out.println();
		}
		
		
	}
}
