package algorithm_practice.practice03.fri;

import java.util.Arrays;
import java.util.Scanner;

public class section6_03_06 {

    static String solution(int n, int[] arr) {
        String answer = "";
        int prev = Integer.MIN_VALUE;
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) answer += (i + 1) + " ";
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
        System.out.println(solution(n, arr));
    }
}
