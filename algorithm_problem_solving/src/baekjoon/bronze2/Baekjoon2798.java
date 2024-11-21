package baekjoon.bronze2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon2798 {

    static int n, m, answer = 0;
    static boolean flag = false;
    static Integer[] arr;
    static void solution(int l, int index, int sum) {
        if (flag) return;
        if (l == 3) {
            if (sum == m) {
                answer = sum;
                flag = true;
            }
            else if (sum < m) answer = Math.max(answer, sum);
        }
        else {
            for (int i = index; i < n; i++) {
                int num = arr[i];
                if (sum + num <= m) {
                    solution(l + 1, i + 1, sum + num);
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        solution(0, 0, 0);
        System.out.println(answer);
    }
}
