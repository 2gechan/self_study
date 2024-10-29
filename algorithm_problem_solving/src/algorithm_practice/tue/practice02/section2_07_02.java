package algorithm_practice.tue.practice02;

import java.util.Scanner;

public class section2_07_02 {
    static int solution(int[] arr) {

        int answer = arr[0] == 1 ? 1 : 0;
        int cnt = answer == 1 ? 1 : 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
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
