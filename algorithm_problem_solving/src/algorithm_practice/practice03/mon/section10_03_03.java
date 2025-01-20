package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section10_03_03 {

    static int solution(int[] arr) {
        int answer = 0;
        int[] tmp = new int[arr.length];
        tmp[0] = 1;
        for (int i = 1; i < arr.length; i++) {

            int max = 0;
            int now = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (now > arr[j]) {
                    max = Math.max(tmp[j], max);
                }
            }
            tmp[i] = max + 1;
            answer = Math.max(tmp[i], answer);

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
