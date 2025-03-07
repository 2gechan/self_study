package algorithm_practice.practice03.thu;

import java.util.Scanner;

public class section7_03_06 {

    static int n;
    static int[] arr;

    static void solution(int l) {
        if (l == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (arr[i] == 1) System.out.print(i + " ");
            }
            System.out.println();
        } else {
            arr[l] = 1;
            solution(l + 1);
            arr[l] = 0;
            solution(l + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n + 1];
        solution(1);
    }
}
