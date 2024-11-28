package algorithm_practice.mon.practice02;

import java.util.Scanner;

// 숫자만 추출
public class section1_09_02 {

    static int solution(String tc) {
        String answer = "";

        for (char c : tc.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        return Integer.valueOf(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
