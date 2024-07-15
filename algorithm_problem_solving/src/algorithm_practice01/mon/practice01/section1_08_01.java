package algorithm_practice01.mon.practice01;

import java.util.Scanner;

/*
유효한 팰린드롬
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다. 알파벳 이외의 문자들의 무시합니다.
 */
public class section1_08_01 {

    static String solution(String testCase) {
        String answer = "YES";
        int lt = 0, rt = testCase.length() - 1;
        testCase = testCase.toLowerCase();
        while (lt < rt) {
            char lc = testCase.charAt(lt);
            char rc = testCase.charAt(rt);
            if (!Character.isAlphabetic(lc)) lt++;
            else if(!Character.isAlphabetic(rc)) rt--;
            else {
                if (lc != rc) return "NO";
                lt++;
                rt--;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
