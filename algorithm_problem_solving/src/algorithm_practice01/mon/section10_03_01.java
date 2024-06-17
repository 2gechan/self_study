package algorithm_practice01.mon;

import java.util.Scanner;

public class section10_03_01 {
    static int solution(int[] arr) {
        int answer = 0;
        int[] dy = new int[arr.length];
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int n = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (n > arr[j]) dy[i] = Math.max(dy[i], dy[j] + 1);
            }
            if (dy[i] == 0) dy[i] = 1;
            answer = Math.max(answer, dy[i]);
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
