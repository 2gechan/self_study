package infren_test.section3;

import java.util.Arrays;
import java.util.Scanner;

public class section3_01 {
    static int[] solution(int n, int m, int[] arr1, int[] arr2) {
        int[] answer = new int[n + m];
        for (int i = 0; i < n; i++) {
            answer[i] = arr1[i];
        }
        for (int i = n, j = 0; i < n + m; i++, j++) {
            answer[i] = arr2[j];
        }
        Arrays.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int x : solution(n, m, arr1, arr2)) System.out.print(x + " ");
    }
}
