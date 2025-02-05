package algorithm_practice.practice03.wed;

import java.util.Scanner;

public class section3_03_04 {

    static int solution(int m, int[] arr) {
        int answer  = 0;

        int lt = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == m) answer++;
            else if (sum > m) {
                while (sum >= m) {
                    sum -= arr[lt++];
                    if (sum == m) answer++;
                }
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
        System.out.println(solution(m, arr));
    }
}
