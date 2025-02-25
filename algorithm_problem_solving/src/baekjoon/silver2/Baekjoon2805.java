package baekjoon.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2805 {

    static int[] arr;
    static int m;
    static int answer = Integer.MIN_VALUE;

    static boolean chk(int mid) {

        boolean result = false;

        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - mid > 0) sum += (arr[i] - mid);
        }
        if (sum >= m) {
            answer = Integer.max(answer, mid);
            result = true;
        }

        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        m = Integer.valueOf(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
            max = Integer.max(max, arr[i]);
        }

        while (min < max) {

            int mid = (min + max) / 2;
            if (chk(mid)) {
                min = mid + 1;
            }
            else {
                max = mid;
            }
        }

        System.out.println(answer);

    }
}
