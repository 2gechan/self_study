package baekjoon.practice;

import java.util.Scanner;

public class p1924 {
    static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] yoil = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    static String solution(int m, int d) {
        String answer = "";
        int day = d;
        // 7로 나눠서 나머지가 0 이면 일요일
        if (m > 1) {
            for (int i = m-1; i >= 1; i--) {
                day += month[i];
            }
        }
        answer = yoil[day % 7];
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(solution(m, d));
    }
}
