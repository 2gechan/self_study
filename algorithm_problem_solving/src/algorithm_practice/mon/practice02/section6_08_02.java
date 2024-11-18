package algorithm_practice.mon.practice02;

import java.util.Arrays;
import java.util.Scanner;

// 이분검색
public class section6_08_02 {

    static int solution(int[] arr, int m) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0, rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) return mid + 1;
            else if (arr[mid] > m) {
                rt = mid - 1;
            }
            else {
                lt = mid + 1;
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
        System.out.println(solution(arr, m));
    }
}
