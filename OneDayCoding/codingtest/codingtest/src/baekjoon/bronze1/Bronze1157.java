package baekjoon.bronze1;

import java.util.HashMap;
import java.util.Scanner;

public class Bronze1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : line.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxCnt = 0;
        String result = "";

        for (char c : map.keySet()) {
            if (map.get(c) == maxCnt) result = "?";
            else if (map.get(c) > maxCnt) {
                maxCnt = map.get(c);
                result = "" + c;
            }
        }

        System.out.println(result.toUpperCase());
    }

}
