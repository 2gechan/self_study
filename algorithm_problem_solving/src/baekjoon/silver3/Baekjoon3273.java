package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon3273 {

    static int solution(int n, int[] arr, int x) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0, rt = arr.length - 1;
        while (lt < rt) {
            int sum = arr[lt] + arr[rt];
            if (sum == x) {
                answer++;
                lt++;
                rt--;
            }
            else if (sum > x) rt--;
            else {
                lt++;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] nums = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(nums[i]);
        }
        int x = Integer.valueOf(br.readLine());
        System.out.println(solution(n, arr, x));
    }
}
