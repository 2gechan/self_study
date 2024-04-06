package baekjoon.practice;

import java.util.Scanner;

public class p2490 {
    static String solution(String[] tc) {
        String answer = "E";
        int zeroCnt = 0;
        for (int i = 0; i < tc.length; i++) {
            if (tc[i].equals("0")) {
                zeroCnt++;
            }
        }
        switch (zeroCnt) {
            case 1:
                answer = "A"; // 도
                break;
            case 2:
                answer = "B"; // 개
                break;
            case 3:
                answer = "C"; // 걸
                break;
            case 4:
                answer = "D"; // 윷
                break;
            default:
                answer = "E"; // 모
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String[] tc = sc.nextLine().split(" ");
            System.out.println(solution(tc));
        }
    }
}
