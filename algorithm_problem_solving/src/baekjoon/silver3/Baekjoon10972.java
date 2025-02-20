package baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10972 {

    // 1 2 4 3
    // 1 2 3 4
    static boolean solution(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) { i--; }
        if (i <= 0) return false;

        int j = nums.length - 1;
        while (nums[j] <= nums[i - 1]) { j--; }

        swap(nums, i - 1, j);
        j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++; j--;
        }
        return true;
    }

    static void swap(int[] nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        if (solution(arr)) {
            for (int x : arr) System.out.print(x + " ");
        }
        else System.out.println(-1);
    }
}
