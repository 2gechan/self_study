package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int oneCnt = 0;
        int zeroCnt = 0;

        // 0001100
        char before = 'z';
        for (char c : s.toCharArray()) {
            if (c == '1') {
                if (c == before) continue;
                else {
                    before = c;
                    oneCnt++;
                }
            }
            else {
                if (c == before) continue;
                else {
                    before = c;
                    zeroCnt++;
                }
            }
        }
        System.out.println(Math.min(oneCnt, zeroCnt));
    }
}
