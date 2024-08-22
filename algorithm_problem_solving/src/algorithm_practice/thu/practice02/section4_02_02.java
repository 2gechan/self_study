package algorithm_practice.thu.practice02;

import java.util.HashMap;
import java.util.Scanner;

public class section4_02_02 {
    static String solution(String word1, String word2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            if (!map.containsKey(c)) return "NO";
            else {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) map.remove(c);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(solution(word1, word2));
    }
}
