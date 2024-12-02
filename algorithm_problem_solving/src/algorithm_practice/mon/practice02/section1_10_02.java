package algorithm_practice.mon.practice02;

import java.util.Arrays;
import java.util.Scanner;

public class section1_10_02 {

    static int[] solution(String s, String t) {
        int cnt = 101;
        int[] arr = new int[s.length()];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == t.charAt(0)) {
                cnt = 0;
                arr[i] = cnt;
            }
            else arr[i] = ++cnt;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.charAt(i) == t.charAt(0)) cnt = 0;
            else {
                arr[i] = Math.min(++cnt, arr[i]);
            }
        }
        return arr;
    }
    // teachermode e
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        String s = line[0];
        String t = line[1];
        for (int x : solution(s, t)) System.out.print(x + " ");
    }
}
