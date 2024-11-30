package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9093 {

    static String[] solution(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String[] line = arr[i].split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < line.length; j++) {
                StringBuffer sbf = new StringBuffer(line[j]);
                 sb.append(sbf.reverse() + " ");
            }
            arr[i] = sb.toString();
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        for (String s : solution(arr)) System.out.println(s);
    }
}
