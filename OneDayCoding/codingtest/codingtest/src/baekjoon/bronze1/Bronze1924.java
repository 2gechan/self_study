package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line, " ");

        int x = Integer.valueOf(st.nextToken());
        int y = Integer.valueOf(st.nextToken());

        int[] calendar = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dotw = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int sumDay = 0;
        for (int i = 0; i < x; i++) {
            sumDay += calendar[i];
        }
        sumDay += y;
        int idx = sumDay % 7;

        System.out.println(dotw[idx]);
    }
}
