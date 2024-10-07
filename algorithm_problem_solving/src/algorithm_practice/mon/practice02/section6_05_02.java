package algorithm_practice.mon.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class section6_05_02 {

    static String solution(int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                answer = "D";
                break;
            }
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
        System.out.println(solution(arr));
    }
}
