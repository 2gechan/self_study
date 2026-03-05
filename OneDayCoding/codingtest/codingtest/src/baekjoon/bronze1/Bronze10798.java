package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        int row = 0;

        for (int i = 0; i < 5; i++) {

            String line = br.readLine();

            int idx = 0;
            for (char c : line.toCharArray()) {
                arr[i][idx++] = c;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] != 0) sb.append(arr[j][i]);
                else continue;

            }
        }
        System.out.println(sb.toString());
    }
}
