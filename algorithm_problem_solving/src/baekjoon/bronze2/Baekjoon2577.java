package baekjoon.bronze2;

import java.util.Scanner;

public class Baekjoon2577 {

    static int[] solution(int A, int B, int C) {
        long result = A * B * C;
        String[] strResultArr = String.valueOf(result).split("");

        int[] arr = new int[10];
        for (String x : strResultArr) {
            int num = Integer.valueOf(x);
            arr[num]++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        for (int x : solution(A, B, C)) {
            System.out.println(x);
        }
    }
}
