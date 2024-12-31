package algorithm_practice.practice03.tue;

import java.util.Scanner;

public class section2_03_02 {

    static int solution(int[] arr) {
        int answer = 0;
        int maxHeight = 0;

        for (int x : arr) {
            if (x > maxHeight) {
                answer++;
                maxHeight = Math.max(maxHeight, x);
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
