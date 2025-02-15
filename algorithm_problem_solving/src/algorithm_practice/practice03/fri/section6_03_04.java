package algorithm_practice.practice03.fri;

import java.util.Scanner;

public class section6_03_04 {

    static int[] solution(int s, int[] work) {
        int[] cash = new int[s];

        for (int x : work) {

            int index = 0;
            for (int i = 0; i < s; i++) {
                // cash hit
                if (cash[i] == x) {
                    for (int j = i; j > 0; j--) {
                        cash[j] = cash[j - 1];
                    }
                    cash[0] = x;
                    break;
                }
            }
            if (cash[0] != x) {
                for (int i = s - 1; i > 0; i--) {
                    cash[i] = cash[i - 1];
                }
                cash[0] = x;
            }
        }

        return cash;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] work = new int[n];
        for (int i = 0; i < n; i++) {
            work[i] = sc.nextInt();
        }
        for (int x : solution(s, work)) System.out.print(x + " ");
    }
}
