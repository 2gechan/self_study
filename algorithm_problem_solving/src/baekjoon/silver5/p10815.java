package baekjoon.silver5;

import java.util.HashMap;
import java.util.Scanner;

public class p10815 {
    static int n, m;
    static int[] solution(HashMap<Integer, Integer> card, int[] sample) {
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            if (card.containsKey(sample[i])) result[i] = 1;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        HashMap<Integer, Integer> card = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tc = sc.nextInt();
            card.put(tc, 0);
        }

        m = sc.nextInt();
        int[] sample = new int[m];
        for (int i = 0; i < m; i++) {
            sample[i] = sc.nextInt();
        }
        for (int x : solution(card, sample)) System.out.print(x + " ");
    }
}
