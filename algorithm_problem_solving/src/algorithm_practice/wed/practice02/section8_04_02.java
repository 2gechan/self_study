package algorithm_practice.wed.practice02;

import java.util.Scanner;

public class section8_04_02 {
    static int[] ch;
    static int n, m;

    static void solution(int v) {
        if (v == m) {
            for (int x : ch) System.out.print(x + " ");
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                    ch[v] = i;
                    solution(v + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[m];
        solution(0);
    }
}
