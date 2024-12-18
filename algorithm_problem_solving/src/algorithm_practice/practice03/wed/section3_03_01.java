package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section3_03_01 {

    static int[] solution(int n, int m, int[] a, int[] b) {
        int[] answer = new int[n + m];

        int ai = 0, bi = 0, index = 0;

        while (ai < n && bi < m) {

            if (a[ai] > b[bi]) {
                answer[index++] = b[bi++];
            }
            else {
                answer[index++] = a[ai++];
            }
        }

        if (ai < n) {
            for (int i = ai; i < n; i++) {
                answer[index++] = a[i];
            }
        }
        else {
            for (int i = bi; i < m; i++) {
                answer[index++] = b[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
