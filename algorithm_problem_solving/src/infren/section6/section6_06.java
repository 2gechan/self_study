package infren.section6;

import java.util.Arrays;
import java.util.Scanner;

public class section6_06 {
    static String solution(int[] t, int n) {
        StringBuilder sb = new StringBuilder();
//        int[] tmp = new int[n];
//        for (int i = 0; i < n; i++) {
//            tmp[i] = t[i];
//        }
        // 위 코드를 array.clone() 하게 되면 똑같다 (깊은복사)
        int[] tmp = t.clone();
        Arrays.sort(t);
        for (int i = 0; i < n; i++) {
            if (tmp[i] != t[i]) {
                sb.append((i + 1) + " ");
            }
        }
        String answer = new String(sb);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        System.out.println(solution(t, n));
    }
}
