package infren_test.section4;

import java.util.HashMap;
import java.util.Scanner;

public class section4_01 {
    static String solution(int n, String[] arr) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 1) + 1);
        }
        int max = 0;
        for (String key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = sc.nextLine().split("");
        System.out.println(solution(n, arr));
    }
}
