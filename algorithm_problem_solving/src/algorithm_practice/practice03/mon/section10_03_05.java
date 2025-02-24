package algorithm_practice.practice03.mon;

import java.util.Arrays;
import java.util.Scanner;

public class section10_03_05 {

    static int solution(int[] arr, int m) {

        int[] dy = new int[m + 1];

        Arrays.fill(dy, Integer.MAX_VALUE);

        Arrays.sort(arr);

        dy[0] = 0;

        for (int i = 0; i < arr.length; i++) {

            int j = arr[i];

            for (; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1);
            }
        }
        return dy[m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(solution(arr, m));
    }
}
