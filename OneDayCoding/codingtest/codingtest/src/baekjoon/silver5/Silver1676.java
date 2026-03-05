package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1676 {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, ...

        int num = Integer.parseInt(br.readLine());
        int result = 0;
        while (num > 0) {
            result += num / 5;
            num /= 5;
        }
        System.out.println(result);


    }
}
