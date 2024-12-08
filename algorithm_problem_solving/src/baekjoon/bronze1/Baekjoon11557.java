package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T > 0) {
            int N = Integer.valueOf(br.readLine());
            int max = 0;
            String name = "";
            for (int i = 0; i < N; i++) {
                String[] line = br.readLine().split(" ");
                int spend = Integer.valueOf(line[1]);
                if (spend > max) {
                    name = line[0];
                    max = spend;
                }
            }
            sb.append(name + "\n");
            T--;
        }
        System.out.println(sb.toString());
    }
}
