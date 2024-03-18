package infren_test.section2;

import java.util.ArrayList;
import java.util.Scanner;

public class section2_01 {
    static ArrayList<Integer> solution(int[] arr) {
        int prev = Integer.MIN_VALUE;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (prev < arr[i]) {
                answer.add(arr[i]);
            }
            prev = arr[i];
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
        for (int x : solution(arr)) System.out.print(x + " ");

    }
}
