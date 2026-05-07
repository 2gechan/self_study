package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea21425 {

    static int calculator(int x, int y, int n) {

        int cnt = 0;
        long max = Math.max(x, y);
        long min = Math.min(x, y);
        long tmp = 0;
        while (max <= n && min <= n) {
            tmp = max + min;
            min = max;
            max = tmp;
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(calculator(x, y, n)).append("\n");
        }

        System.out.println(sb.toString());

    }
}
