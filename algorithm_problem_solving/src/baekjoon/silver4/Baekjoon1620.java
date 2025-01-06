package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int N = Integer.valueOf(NM[0]);
        int M = Integer.valueOf(NM[1]);
        HashMap<Integer, String> numMap = new HashMap<>();
        HashMap<String, Integer> strMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            numMap.put(i, line);
            strMap.put(line, i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String problem = br.readLine();
            if (Character.isDigit(problem.charAt(0))) {
                sb.append(numMap.get(Integer.valueOf(problem)) + "\n");
            } else sb.append(strMap.get(problem) + "\n");
        }
        System.out.println(sb.toString());
    }
}
