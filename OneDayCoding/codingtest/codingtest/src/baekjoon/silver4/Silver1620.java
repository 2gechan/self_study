package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Silver1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> intMap = new HashMap<>();
        HashMap<String, Integer> strMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            intMap.put(i, line);
            strMap.put(line, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            if (Character.isDigit((char) line.charAt(0))) {
                sb.append(intMap.get(Integer.parseInt(line)));
            } else sb.append(strMap.get(line));
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
