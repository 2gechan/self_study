package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section8_03_06 {

    static int[] ch, arr, result;
    static int n, m;
    static void solution(int l) {

        if (l == m) {
            for (int x : result) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        else {

            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    result[l] = arr[i];
                    solution(l + 1);
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        result = new int[m];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0);
    }
}
