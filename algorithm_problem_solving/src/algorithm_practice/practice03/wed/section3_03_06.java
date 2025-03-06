package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section3_03_06 {

    static int solution(int[] arr, int k) {
        int answer = 0;

        int len = 0;
        int lt = 0;

        int cnt = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            if (arr[rt] == 0) {
                cnt++;
                if (cnt > k) {
                    while (cnt > k) {
                        if (arr[lt++] == 0) cnt--;
                    }
                }
                len = rt - lt + 1;

            } else len = rt - lt + 1;

            answer = Math.max(answer, len);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, k));
    }
}
