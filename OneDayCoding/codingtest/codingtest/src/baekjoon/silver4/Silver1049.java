package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1049 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int packMin = Integer.MAX_VALUE;
        int singMin = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            packMin = Math.min(Integer.parseInt(st.nextToken()), packMin);
            singMin = Math.min(Integer.parseInt(st.nextToken()), singMin);
        }

        int cost = 0;
        while (n > 0) {

            if (n >= 6) {
                if (singMin * 6 > packMin) {
                    cost += packMin;
                }
                else {
                    cost += (singMin * 6);
                }
                n -= 6;
            }
            else {
                if (singMin * n > packMin) {
                    cost += packMin;
                }
                else {
                    cost += (singMin * n);
                }
                n -= n;
            }
        }
        System.out.println(cost);
    }
}
