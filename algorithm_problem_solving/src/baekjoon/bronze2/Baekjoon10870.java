package baekjoon.bronze2;

import java.util.Scanner;

public class Baekjoon10870 {

    static int n;
    static int[] arr;

    static int solution(int num) {
        if (num == 1 || num == 2) return 1;
        else {
            return arr[num - 1] + arr[num - 2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = solution(i);
        }
        System.out.println(arr[n]);
    }
}
