package algorithm_practice.tue.practice02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// 등수구하기
public class section2_08_02 {
    static int[] solution(Integer[] arr) {

        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int score = arr[i];
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (score < arr[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(arr)) System.out.print(x + " ");
    }
}
