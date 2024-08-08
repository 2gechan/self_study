package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section01_01_02 {
    static int solution(String testCase, String t) {
        int answer = 0;
        testCase = testCase.toLowerCase();
        char c = t.toLowerCase().charAt(0);
        for (char x : testCase.toCharArray()) {
            if (x == c) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(solution(testCase, t));
    }
}
