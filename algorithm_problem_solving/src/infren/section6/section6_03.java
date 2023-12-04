package infren.section6;

import java.util.Scanner;

// 삽입 정렬
public class section6_03 {
    static int[] solution(int[] t, int n) {
        for (int i = 1; i < n; i++) {
            int tmp = t[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (t[j] > tmp) t[j + 1] = t[j];
                else break;
            }
            t[j + 1] = tmp;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        for (int i : solution(t, n)) System.out.print(i + " ");
    }
}
