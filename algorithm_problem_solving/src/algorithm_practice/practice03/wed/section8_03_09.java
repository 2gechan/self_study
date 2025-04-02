package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section8_03_09 {

    static int n, m;
    static int[] arr, result;
    static boolean[] chk;


    static void solution(int l) {
        if (l == m) {
            for (int x : result) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (!chk[i]) {
                    chk[i] = true;
                    result[l] = arr[i];
                    solution(l + 1);
                    chk[i] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        chk = new boolean[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0);
    }
}
