package algorithm_practice01.mon;

import java.util.Scanner;

/*
대소문자 변환
대문자는 소문자로, 소문자는 대문자로 변환하기
a : 97, A : 65
 */
public class section1_02_01 {
    static String solution(String t) {
        String answer = "";
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) < 97) answer += String.valueOf(t.charAt(i)).toLowerCase();
            else answer += String.valueOf(t.charAt(i)).toUpperCase();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(solution(t));
    }
}
