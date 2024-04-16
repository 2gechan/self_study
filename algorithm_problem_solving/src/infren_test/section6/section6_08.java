package infren_test.section6;

import java.util.Arrays;
import java.util.Scanner;

public class section6_08 {
    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n - 1;
        while (lt <= rt) {
            int index = (lt + rt) / 2;
            if (arr[index] == m) {
                answer = index + 1;
                break;
            }
            if (arr[index] < m) {
                lt = index + 1;
            } else {
                rt = index - 1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(n, m, arr));
    }
}
