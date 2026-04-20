package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon25192 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();
        int result = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line.equals("ENTER")) {
                result += hashSet.size();
                hashSet = new HashSet<>();
            }
            else {
                hashSet.add(line);
            }
        }
        result += hashSet.size();
        System.out.println(result);
    }
}
