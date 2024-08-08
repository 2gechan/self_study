package algorithm_practice.mon.practice01;

import java.util.Scanner;

/*
문자 찾기
입력받은 문자열안에 입력받은 문자가 몇개 포함되어 있는지 찾기
# 대소문자 구분 X, 문자열 길이 100 이하
 */
public class section1_01_01 {
    static int solution(String tc1, String tc2) {
        int answer = 0;
        tc1 = tc1.toLowerCase();
        char c = tc2.charAt(0);
        for (char x : tc1.toCharArray()) {
            if (c == x) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc1 = sc.nextLine();
        String tc2 = sc.nextLine();
        System.out.println(solution(tc1, tc2));
    }


}
