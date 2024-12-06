package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section1_11_02 {
    static String solution(String testCase) {
        String answer = "";

        String prev = "";
        int cnt = 1;
        for (int i = 0; i < testCase.length(); i++) {
            String current = String.valueOf(testCase.charAt(i));
            if (current.equals(prev)) cnt++;
            else {
                if (cnt > 1) answer += cnt;
                cnt = 1;
                answer += current;
            }
            prev = current;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
