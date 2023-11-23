package infren.section3;

import java.util.Scanner;

public class section3_06 {
    static int solution(int n, int k, int[] t) {
        int lt = 0, len = 0, ch = 0;
        for (int rt = 0; rt < n; rt++) {
            if (t[rt] == 0) ch++;
            while (ch > k) {
                if (t[lt] == 0) ch--;
                lt++;
            }
            len = Math.max(len, rt - lt + 1);
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, t));
    }
}
