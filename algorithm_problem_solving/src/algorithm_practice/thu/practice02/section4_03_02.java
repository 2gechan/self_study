package algorithm_practice.thu.practice02;

import java.util.HashMap;
import java.util.Scanner;

public class section4_03_02 {

    static String solution(int n, int k, int[] arr) {
        String answer = "";
        int lt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer += map.size() + " ";

        for (int i = k; i < n; i++) {
            int tmp = arr[lt];
            int count = map.get(tmp);
            if (count == 1) map.remove(tmp);
            else map.put(tmp, map.get(tmp) - 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            lt++;
            answer += map.size() + " ";
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
