package algorithm_practice.thu.practice01;

import java.util.HashMap;
import java.util.Scanner;

/*
아나그램(해쉬)
아나그램이란 두 문자열이 알파벳의 순서는 다르지만
그 구성이 일치하면 아나그램이라고 한다.
두 단어가 아나그램인지 판별하시오
 */
public class section4_02_01 {
    static String solution(String tc1, String tc2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : tc1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : tc2.toCharArray()) {
            map.put(x, map.get(x) - 1);
            if (map.get(x) < 0) return "NO";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc1 = sc.nextLine();
        String tc2 = sc.nextLine();
        System.out.println(solution(tc1, tc2));
    }
}

