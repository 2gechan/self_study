package algorithm_practice.fri.practice02;

import java.util.*;
import java.util.Scanner;

// 교육과정 설계
public class section5_07_02 {

    static String solution(String necessary, String all) {

        Queue<Character> q = new LinkedList<>();
        for (char c : necessary.toCharArray()) {
            q.offer(c);
        }
        for (char c : all.toCharArray()) {
            if (q.peek() == c) q.poll();
            if (q.size() == 0) return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String necessary = sc.nextLine();
        String all = sc.nextLine();
        System.out.println(solution(necessary, all));
    }

}
