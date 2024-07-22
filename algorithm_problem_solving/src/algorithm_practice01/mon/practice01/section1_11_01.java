package algorithm_practice01.mon.practice01;

import java.util.Scanner;

/*
문자열 압축
알파벳 대문자로 이루어진 문자열을 입력받아
같은 문자가 연속으로 반복되는 경우
반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로
문자열을 압축하는 프로그램을 작성하시오. 단 반복횟수가 1인 경우 생략합니다.
KKHSSSSSSSE
 */
public class section1_11_01 {
    static String solution(String tc) {
        String answer = "";
        tc = tc + " ";
        int cnt = 1;
        for (int i = 0; i < tc.length() - 1; i++) {
            char tmp = tc.charAt(i);
            if (tc.charAt(i + 1) == tmp) cnt++;
            else {
                answer += cnt == 1 ? tc.charAt(i) : tc.charAt(i) + "" + cnt;
                cnt = 1;
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
