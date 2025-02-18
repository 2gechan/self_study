package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1449 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int l = Integer.valueOf(st.nextToken());

        int[] arr = new int[1001];

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[Integer.valueOf(st.nextToken())] = 1;
        }

        for (int i = 1; i <= 1000; i++) {
            if (arr[i] == 1) {
                i += l - 1; // 양옆으로 0.5씩 추가로 붙어야하기 때문에 -1을 빼줘서 커버할 수 있는 범위 체크
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
