package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section8_03_07 {
    static int[][] arr;

    static int solution(int n, int r) {
        if (arr[n][r] != 0) return arr[n][r];
        if (n == r || r == 0) return arr[n][r] = 1;
        else {
            return arr[n][r] = solution(n - 1, r) + solution(n - 1, r - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        arr = new int[n + 1][r + 1];
        solution(n, r);
        System.out.println(arr[n][r]);
    }
}
