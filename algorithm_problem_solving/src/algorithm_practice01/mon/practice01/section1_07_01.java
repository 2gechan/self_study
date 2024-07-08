package algorithm_practice01.mon.practice01;

import java.util.Scanner;

/*
회문 문자열
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES",
회문 문자열이 아니면 “NO"를 출력 하는 프로그램을 작성하세요.
단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 */
public class section1_07_01 {
    static String solution(String testCase) {
        String answer = "YES";
        int lt = 0, rt = testCase.length() - 1;
        testCase = testCase.toLowerCase();
        System.out.println(testCase);
        while (lt <= rt) {
            if (testCase.charAt(lt) != testCase.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
