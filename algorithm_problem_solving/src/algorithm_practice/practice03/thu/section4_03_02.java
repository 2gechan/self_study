package algorithm_practice.practice03.thu;

import java.util.HashMap;
import java.util.Scanner;

public class section4_03_02 {

    static String solution(String word1, String word2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : word1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            if (!map.containsKey(c)) {
                answer = "NO";
                break;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }
        if (map.size() > 0) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        System.out.println(solution(word1, word2));
    }
}
