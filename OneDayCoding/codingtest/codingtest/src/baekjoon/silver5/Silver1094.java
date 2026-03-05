package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1094 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        int stick = 64;
        int cnt = 0;

        while (X > 0) {

            if (stick > X) {
                stick /= 2;
            }
            else {
                X -= stick;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
