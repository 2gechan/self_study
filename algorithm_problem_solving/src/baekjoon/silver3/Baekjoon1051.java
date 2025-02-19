package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.valueOf(row[j]);
            }
        }

        int len = Math.min(n, m);
        // 정사각형의 최대 길이는 N과 M 중 더 작은 것

        while(len > 1) {
            for(int i=0; i<= n-len; i++) {
                for(int j=0; j<=m-len; j++) {
                    int num = arr[i][j];
                    // 꼭짓점 3군데 비교
                    if(num==arr[i][j+len-1] && num == arr[i+len-1][j] && num == arr[i+len-1][j+len-1]) {
                        System.out.println(len*len);
                        return;
                    }
                }
            }
            len--;
        }
        System.out.println(len * len);

    }
}
