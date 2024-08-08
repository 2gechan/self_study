package algorithm_practice.thu.practice01;

import java.util.HashMap;
import java.util.Scanner;

/*
학급 회장
A,B,C,D,E 중 n 명의 투표 수 를 받아 학급 회장 뽑기
Hash 활용
 */
public class section4_01_01 {
    static char solution(String t) {
        char answer = 'x';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                answer = x;
                max = map.get(x);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String t = sc.nextLine();
        System.out.println(solution(t));
    }
}
