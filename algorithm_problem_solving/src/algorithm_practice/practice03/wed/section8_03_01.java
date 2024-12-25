package algorithm_practice.practice03.wed;

import java.util.Arrays;
import java.util.Scanner;

public class section8_03_01 {
    static boolean flag = false;
    static int[] arr, ch;
    static int n, sum;
    static void solution(int l, int result) {
        if (flag) return;
        if (l == n) {
            if (sum - result == result) flag = true;
        }
        else {
            solution(l + 1, result + arr[l]);
            solution(l + 1, result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ch = new int[n];
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sum = Arrays.stream(arr).sum();
        solution(0, 0);
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
