package algorithm_practice01.mon.practice01;

import java.util.Scanner;

/*
숫자만 추출
문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205 이 됩니다.
추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

 */
public class section1_09_01 {
    static int solution(String testCase) {
        String answer = "";
        for (int i = 0; i < testCase.length(); i++) {
            if (Character.isDigit(testCase.charAt(i))) answer += testCase.charAt(i);
        }

        return Integer.valueOf(answer);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
