package algorithm_practice.practice03.thu;

import java.util.Scanner;

public class section7_03_04 {
    static int[] arr;
    static int n;
    static int solution(int n) {
        if (n == 1 || n == 2) return arr[n] = 1;
        else {
            return arr[n] = solution(n - 1) + solution(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        solution(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
