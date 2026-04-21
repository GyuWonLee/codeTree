import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();

        // 결과 판별 및 출력
        System.out.println(getResult(Y, M, D));
        
        sc.close();
    }

    // 최종 결과를 반환하는 함수
    public static String getResult(int y, int m, int d) {
        // 1. 날짜가 유효한지 확인
        if (!isValidDate(y, m, d)) {
            return "-1";
        }
        // 2. 유효하다면 계절 반환
        return getSeason(m);
    }

    // 윤년 조건 로직 (단계별 분리)
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;      // 400의 배수는 무조건 윤년
        if (year % 100 == 0) return false;     // 100의 배수인데 400의 배수가 아니면 평년
        if (year % 4 == 0) return true;        // 4의 배수면 윤년
        return false;                          // 그 외 평년
    }

    // 날짜 유효성 검사 함수
    public static boolean isValidDate(int y, int m, int d) {
        if (m < 1 || m > 12) return false;

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 2월 윤년 처리
        if (isLeapYear(y)) {
            daysInMonth[2] = 29;
        }

        if (d < 1 || d > daysInMonth[m]) return false;

        return true;
    }

    // 계절 판별 함수
    public static String getSeason(int m) {
        if (m >= 3 && m <= 5) return "Spring";
        if (m >= 6 && m <= 8) return "Summer";
        if (m >= 9 && m <= 11) return "Fall";
        return "Winter"; // 12, 1, 2월
    }
}