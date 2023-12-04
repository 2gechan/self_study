package infren.section6;

import java.util.Scanner;

// 버블 정렬
public class section6_02 {
    static int[] solution(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length - 1; j++) {
                if (t[j] > t[j + 1]) {
                    int tmp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = tmp;
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
