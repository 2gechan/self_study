package infren.section3;

import java.util.Arrays;
import java.util.Scanner;

public class section3_01 {
    static String solution(int[] t1, int n, int[] t2, int m) {
        int[] tmp = new int[n + m];
        for (int i = 0; i < n; i++) {
            tmp[i] = t1[i];
        }
        for (int i = 0; i < m; i++) {
            tmp[n++] = t2[i];
        }
        Arrays.sort(tmp);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tmp.length; i++) {
            sb.append(tmp[i] + " ");
        }
        String answer = new String(sb);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t1 = new int[n];
        for (int i = 0; i < n; i++) {
            t1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] t2 = new int[m];
        for (int i = 0; i < m; i++) {
            t2[i] = sc.nextInt();
        }
        String answer = solution(t1, n, t2, m);
        System.out.println(answer);


    }
}
