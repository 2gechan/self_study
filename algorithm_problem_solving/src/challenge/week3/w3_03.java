package challenge.week3;

import java.util.Scanner;

public class w3_03 {

    static long[] arr;
    static long solution(int n) {
        if (n == 1 || n == 2) return 1;
        if (arr[n] != 0) return arr[n];
        else {
            return arr[n] = solution(n - 1) + solution(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new long[n + 1];
        System.out.println(solution(n));
    }
}
