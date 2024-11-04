package algorithm_practice.mon.practice02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 좌표 정렬
public class section6_07_02 {

    static int[][] solution(int[][] arr) {

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int[] x : solution(arr)) {
            System.out.println(x[0] + " " + x[1]);
        }
    }
}
