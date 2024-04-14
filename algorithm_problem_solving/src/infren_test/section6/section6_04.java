package infren_test.section6;

import java.util.Scanner;

public class section6_04 {
    static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i<n; i++) if (arr[i] == x) pos = i;
            if (pos == -1) {
                for (int j = n - 1; j >= 1; j--) {
                    answer[j] = answer[j - 1];
                }
                answer[0] = x;
            }
            else {
                for (int j = pos; j >= 1; j--) {
                    answer[j] = answer[j - 1];
                }
                answer[0] = x;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) System.out.print(x + " ");

    }
}
