package algorithm_practice.practice03.tue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class section9_03_01 {

    static int solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i][1] < arr[j][1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr[i][0] = height;
            arr[i][1] = weight;
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        System.out.println(solution(n, arr));

    }
}
