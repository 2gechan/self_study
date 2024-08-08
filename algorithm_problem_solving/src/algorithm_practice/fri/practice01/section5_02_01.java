package algorithm_practice.fri.practice01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
괄호문자제거
입력된 문자열에서 () 사이 존재하는 모든 문자를 제거하고
남은 문자만 출력하라
 */
public class section5_02_01 {
    static String solution(String t) {
        String answer = "";
        Queue<Character> q = new LinkedList<>();
        for (char x : t.toCharArray()) {
            if (q.isEmpty() && x != '(' && x != ')') answer += String.valueOf(x);
            else if (x == '(') q.offer(x);
            else if (x == ')') {
                q.poll();
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
