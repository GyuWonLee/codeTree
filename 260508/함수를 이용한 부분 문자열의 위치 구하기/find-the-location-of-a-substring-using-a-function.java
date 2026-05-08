import java.util.Scanner;

public class Main {

    // 함수 정의: 부분 문자열의 시작 인덱스를 반환
    public static int findSubstringIndex(String str, String target) {
        return str.indexOf(target); // indexOf()가 첫 등장 인덱스를 반환, 없으면 -1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String target = sc.nextLine();

        int index = findSubstringIndex(s, target);
        System.out.println(index);
        
        sc.close();
    }
}