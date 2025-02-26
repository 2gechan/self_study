package algorithm_practice.practice03.wed;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class section8_03_05 {
    static int n, m;
    static Integer[] arr;

    static int answer = Integer.MAX_VALUE;
    static void solution(int sum, int cnt) {

        if (sum > m) return;
        if (sum > answer) return;
        if (sum == m) answer = Math.min(answer, cnt);
        else {

            for (int i = 0; i < n; i++) {
                solution(sum + arr[i], cnt + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        solution(0, 0);
        System.out.println(answer);
    }
}
