package infren.section4;

import java.util.HashMap;
import java.util.Scanner;

public class section4_01 {
    static char solution(int n, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int max = 0;
        char answer = ' ';
        for (char x : map.keySet()) {
            if (map.get(x) > max) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String t = sc.nextLine();
        System.out.println(solution(n, t));
    }
}
