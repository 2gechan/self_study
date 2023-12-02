package infren.section6;

import java.util.Scanner;

// 선택정렬 알고리즘
public class section6_01 {
    static int[] solution(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i] > t[j]) {
                    int tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
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
        t = solution(t);
        for (int i = 0; i < n; i++) {
            System.out.print(t[i] + " ");
        }
    }
}
