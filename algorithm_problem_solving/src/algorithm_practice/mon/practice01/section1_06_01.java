package algorithm_practice.mon.practice01;

import java.util.Scanner;

/*
중복문자제거
소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
public class section1_06_01 {
    static String solution(String testCase) {
        String answer = "";
        for (int i = 0; i < testCase.length(); i++) {
            char x = testCase.charAt(i);
            if (testCase.indexOf(x) == i) answer += String.valueOf(x);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
