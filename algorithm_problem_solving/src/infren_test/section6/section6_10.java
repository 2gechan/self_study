package infren_test.section6;

import java.util.Arrays;
import java.util.Scanner;

public class section6_10 {
    static int count(int[] arr, int capacity) {
        int cnt = 1, ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= capacity) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = Arrays.stream(arr).max().getAsInt();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= m) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
