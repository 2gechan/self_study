package algorithm_practice.mon.practice02;

import java.util.Arrays;
import java.util.Scanner;

// 뮤직비디오(결정알고리즘)
public class section6_09_02 {
    static int[] arr;

    static int check(int mid) {

        int cnt = 1, sum = 0;

        for (int x : arr) {
            sum += x;
            if (sum > mid) {
                sum = x;
                cnt++;
            }
        }
        return cnt;
    }

    static int solution(int m) {

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (check(mid) <= m) {
                answer = mid;
                // 정해진 DVD 개수는 맞지만 너무 큰 용량에 넣었는지 확인하기 위해 범위를 줄인다.
                rt = mid - 1;
            }
            // 정해진 DVD 개수에 다 못넣었기 때문에 용량을 키운다.
            else lt = mid + 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(m));
    }
}
