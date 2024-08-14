package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section8_01_02 {

    static int n;
    static int[] arr;
    static String answer = "NO";
    static boolean flag = false;
    static void solution(int l, int result) {
        if (flag) return;
        if (l == n) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            if (sum - result == result) {
                answer = "YES";
                flag = true;
            }
        } else {
            solution(l + 1, result + arr[l]);
            solution(l + 1, result);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0, 0);
        System.out.println(answer);
    }
}
