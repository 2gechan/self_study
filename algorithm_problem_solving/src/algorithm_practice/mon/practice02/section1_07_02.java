package algorithm_practice.mon.practice02;

import java.util.Scanner;

// 회문 문자열
public class section1_07_02 {
    static String solution(String tc) {
        String answer = "YES";

        int lt = 0;
        int rt = tc.length() - 1;
        while (lt < rt) {

            char left = Character.toLowerCase(tc.charAt(lt));
            char right = Character.toLowerCase(tc.charAt(rt));
            if (left != right) return "NO";
            lt++;
            rt--;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
