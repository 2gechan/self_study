package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea1926 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            String[] strNums = (i + "").split("");
            String clap = "";
            for (int j = 0; j < strNums.length; j++) {
                String num = strNums[j];
                if (num.equals("3") || num.equals("6") || num.equals("9")) {
                    clap += "-";
                }
            }
            if (clap.isEmpty()) sb.append(i).append(" ");
            else sb.append(clap).append(" ");
        }
        System.out.println(sb.toString());

    }
}
