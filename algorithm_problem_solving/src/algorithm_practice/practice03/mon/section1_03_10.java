package algorithm_practice.practice03.mon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class section1_03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        String c = st.nextToken();
        char e = st.nextToken().charAt(0);

        char[] arr = c.toCharArray();
        int[] result = new int[arr.length];
        Arrays.fill(result, 101);
        int cnt = 101;
        for (int lt = 0; lt < arr.length; lt++) {
            cnt++;
            if (arr[lt] == e) cnt = 0;
            result[lt] = Math.min(result[lt], cnt);
        }
        cnt = 101;
        for (int rt = arr.length - 1; rt >= 0; rt--) {
            cnt++;
            if (arr[rt] == e) cnt = 0;
            result[rt] = Math.min(result[rt], cnt);
        }
        for (int x : result) System.out.print(x + " ");
    }
}
