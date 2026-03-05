package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bronze1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");
        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());

        List<Integer> list = new ArrayList<>();


        for (int j = 1; j <= b; j++) {
            int cnt = 0;
            while (cnt < j) {
                list.add(j);

                cnt++;
            }
        }
        int sum = 0;
        for (int i = a - 1; i < b; i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
