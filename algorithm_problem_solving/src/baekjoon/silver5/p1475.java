package baekjoon.silver5;

import java.util.Scanner;

public class p1475 {
    static int solution(int n) {
        int answer = 0;
        int[] arr = new int[10];
        String[] tc = String.valueOf(n).split("");
        for (String x : tc) {
            if (Integer.valueOf(x) == 6) arr[9]++;
            else {
                arr[Integer.valueOf(x)]++;
            }
        }
        int max = 0;
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }
        int sixNine = arr[9] / 2;
        if (arr[9] % 2 == 1) sixNine++;
        answer = Math.max(max, sixNine);

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
