package algorithm_practice.practice03.thu;

import java.util.HashMap;
import java.util.Scanner;

public class section4_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String[] line = sc.nextLine().split("");
        for (int i = 0; i < n; i++) {
            String alphabet = line[i];
            map.put(alphabet, map.getOrDefault(alphabet, 0) + 1);
        }
        int max = 0;
        String result = "";
        for (String s : map.keySet()) {
            if (map.get(s) > max) {
                max = map.get(s);
                result = s;
            }
        }
        System.out.println(result);
    }
}
