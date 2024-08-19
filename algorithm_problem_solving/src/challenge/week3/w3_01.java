package challenge.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class w3_01 {

    static int upperBound(int[] arr, int key) {
        int lo = 0, hi = arr.length;

        while (lo < hi) {

            int mid = (lo + hi) / 2;
            if (key < arr[mid]) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }
        return lo;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int t = Integer.valueOf(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {

            int answer = 0;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.valueOf(st.nextToken());
            int m = Integer.valueOf(st.nextToken());

            int[] A = new int[n];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                A[j] = Integer.valueOf(st.nextToken());
            }

            Arrays.sort(A);

            st = new StringTokenizer(br.readLine(), " ");
            for (int k = 0; k < m; k++) {
                int B = Integer.valueOf(st.nextToken());
                answer += n - upperBound(A, B);
            }

            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}
