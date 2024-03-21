package infren_test.section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class section2_06 {
    static List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String t = String.valueOf(arr[i]);
            StringBuilder sb = new StringBuilder(t);
            t = String.valueOf(sb.reverse());
            int rvsT = Integer.valueOf(t);
            if (rvsT == 1 || rvsT == 0) continue;
            int cnt = 0;
            for (int j = 2; j < rvsT; j++) {
                if (rvsT % j == 0) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 0) answer.add(rvsT);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) System.out.print(x + " ");
    }
}
