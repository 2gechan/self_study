package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea1859 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long max = Long.MIN_VALUE;
            long result = 0L;
            long num = 0L; // 구매한 매물 개수
            long cost = 0L; // 매물들을 구매하는데 든 총 비용
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > max) {
                    result += (max * num - cost);
                    max = arr[i];
                    num = 0;
                    cost = 0;
                }
                else {
                    num++;
                    cost += arr[i];
                }
            }

            result += (max * num - cost);

            sb.append("#" + cnt + " ").append(result).append("\n");
            cnt++;
        }
        System.out.println(sb.toString());
    }
}
