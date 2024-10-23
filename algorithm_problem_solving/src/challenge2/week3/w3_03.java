package challenge2.week3;

import java.util.Arrays;
import java.util.Scanner;

public class w3_03 {
    static long solution(int[] arr) {
        long answer = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int rank = arr[i];
            int finalNum = rank - (i + 1);
            if (finalNum < 0) finalNum *= -1;
            answer += finalNum;
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
