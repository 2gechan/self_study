package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Silver1026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            B.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(A);
        B.sort(Collections.reverseOrder());

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (A.get(i) * B.get(i));
        }
        System.out.println(sum);
    }
}
