package infren_test.section10;

import java.util.Arrays;
import java.util.Scanner;

public class section10_05 {
    static int[] dy;
    static int solution(int[] arr, int m) {
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
        int[] collection = new int[n];
        for (int i = 0; i < n; i++) {
            collection[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        dy = new int[m + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        System.out.println(solution(collection, m));
    }
}
