package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section1_06_02 {

    static String solution(String tc) {
        String answer = "";
        String[] tmp = tc.split("");

        for (int i = 0; i < tc.length(); i++) {
            if (tc.indexOf(tmp[i]) == i) {
                answer += tmp[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
