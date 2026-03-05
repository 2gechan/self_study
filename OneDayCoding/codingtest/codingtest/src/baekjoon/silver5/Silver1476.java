package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver1476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());;

        int year = 0;
        int tmpE = 0;
        int tmpS = 0;
        int tmpM = 0;

        while (true) {
            year++;
            tmpE++;
            tmpS++;
            tmpM++;


            if (tmpE > 15) tmpE = 1;
            if (tmpS > 28) tmpS = 1;
            if (tmpM > 19) tmpM = 1;

            if (tmpE == E && tmpS == S && tmpM == M) break;
        }
        System.out.println(year);
    }
}
