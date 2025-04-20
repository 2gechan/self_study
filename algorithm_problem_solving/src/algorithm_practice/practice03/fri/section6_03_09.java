package algorithm_practice.practice03.fri;

import java.util.Arrays;
import java.util.Scanner;

public class section6_03_09 {

    static int chk(int[] arr, int mid) {

        int cnt = 1;
        int sum = 0;

        for (int x : arr) {
            if (sum + x > mid) {
                sum = x;
                cnt++;
            }
            else sum += x;
        }

        return cnt;
    }

    static int solution(int[] arr, int m) {

        int answer = 0;

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (chk(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
            }
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
        System.out.println(solution(arr, m));
    }
}
