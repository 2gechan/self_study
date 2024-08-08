package algorithm_practice.thu.practice02;

import java.util.HashMap;
import java.util.Scanner;

public class section4_01_02 {

    static String solution(String vote) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : vote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        String answer = "";
        for (char c : map.keySet()) {
            if (map.get(c) > max) {
                max = map.get(c);
                answer = String.valueOf(c);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String vote = sc.nextLine();
        System.out.println(solution(vote));
    }
}
