package baekjoon.silver5;

import java.util.HashMap;
import java.util.Scanner;

public class p1316 {
    static int solution(String word) {
        HashMap<Character, Integer> map = new HashMap();
        for (char x : word.toCharArray()) {
            map.put(x, 1);
        }
        for (char x : map.keySet()) {
            for (int i = word.indexOf(x); i < word.lastIndexOf(x); i++) {
                if (word.charAt(i) != x) return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int result = 0;
        for (int i = 0; i < n; i++) {
            String tc = sc.nextLine();
            result += solution(tc);
        }
        System.out.println(result);
    }
}
