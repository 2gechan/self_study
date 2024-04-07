package infren_test.section4;

import java.util.*;

public class section4_05 {
    static int solution(int n, int k, int[] arr) {
        int answer = -1;
        TreeSet<Integer> tree = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tree.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : tree) {
            cnt++;
            if (cnt == k) answer = x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n, k, arr));

    }
}
