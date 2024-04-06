package infren_test.section4;

import java.util.HashMap;
import java.util.Scanner;

public class section4_02 {
    static String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            map1.put(a.charAt(i), map1.getOrDefault(a.charAt(i), 0) + 1);
            map2.put(b.charAt(i), map2.getOrDefault(b.charAt(i), 0) + 1);
        }
        for (char x : map1.keySet()) {
            if (map1.get(x) != map2.get(x)) return "NO";
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
