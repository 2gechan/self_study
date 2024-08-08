package algorithm_practice.mon.practice01;

import java.util.Scanner;

/*
문장 속 단어
한 개의 문장이 주어 지면 그 문장 속에서 가장 긴 단어를 출력
 */
public class section1_03_01 {
    static String solution(String t) {
        String answer = "";
        for (String x : t.split(" ")) {
            if (x.length() > answer.length()) {
                answer = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(solution(t));
    }
}
