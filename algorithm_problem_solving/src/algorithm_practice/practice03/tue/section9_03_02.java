package algorithm_practice.practice03.tue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class section9_03_02 {

    static int solution(int n, int[][] arr) {
        int answer = 0;

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int sTime = 0, eTime = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][0] >= sTime) {
                answer++;
                sTime = arr[i][1];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr[i][0] = s;
            arr[i][1] = e;
        }
        System.out.println(solution(n, arr));
    }
}
