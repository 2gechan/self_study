package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split("");

        int[] arr = new int[10];

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num == 6) arr[9]++;
            else {
                arr[num]++;
            }
        }

        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        int sixNine = arr[9] / 2;
        if (arr[9] % 2 == 1) sixNine++;

        int result = Math.max(max, sixNine);
        System.out.println(result);


    }
}
