package algorithm_practice.practice03.thu;

import java.util.HashMap;
import java.util.Scanner;

public class section4_03_03 {

    static String solution(int K, int[] arr) {
        StringBuilder sb = new StringBuilder();

        int lt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < K - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = K - 1; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            int count = map.size();
            sb.append(count + " ");
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);

            lt++;
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(K, arr));
    }
}
