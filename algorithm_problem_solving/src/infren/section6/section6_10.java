package infren.section6;

import java.util.Arrays;
import java.util.Scanner;

public class section6_10 {
    static int count(int[] arr, int c) {
        int cnt = 1;
        int ep = arr[0]; // 제일 왼쪽 좌표에 배치하는게 유리하다고 해서 배치
        for (int i = 1; i < arr.length; i++) {
            // c는 말을 배치할 간
            if (arr[i] - ep >= c) {
                cnt++;
                ep = arr[i];
            }
        }
        // return 값은 마굿간에 들어간 말의 수
        return cnt;
    }

    static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            // 말을 배치할 간격
            int mid = (lt + rt) / 2;
            // c는 마굿간에 들어갈 말의 수이기 때문에 count 함수의
            // return 값이 c 보다 작으면 틀리다
            // c보다 작으면 말이 다 들어갈 수 없다.
            if (count(arr, mid) >= c) {
                answer = mid;
                // 최대값을 찾아야한다.
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n, c, arr));
    }
}
