package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze1259 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = br.readLine();
            if (line.equals("0")) break;

            int rt = line.length() - 1;

            boolean flag = false;
            for (int lt = 0; lt <= rt; lt++) {
                if (line.charAt(lt) != line.charAt(rt)) {
                    flag = true;
                    break;
                }
                rt--;
            }

            if (flag) sb.append("no").append("\n");
            else sb.append("yes").append("\n");

        }
        System.out.println(sb.toString());
    }
}
