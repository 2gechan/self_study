package algorithm_practice.mon.practice01;

import java.util.Scanner;

/*
가장 짧은 문자거리
한 개의 문자열 s와 문자 t가 주어지면
문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출 력하는 프로그램을 작성하세요.
 */
public class section1_10_01 {
    static int[] solution(String s, String t) {
        int[] arr = new int[s.length()];
        char c = t.charAt(0);
        int index = 100;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) index = 0;
            else index++;

            arr[i] = index;
        }
        index = 100;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) index = 0;
            else {
                index++;
                arr[i] = Math.min(arr[i], index);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        for (int x : solution(s, t)) System.out.print(x + " ");
    }
}
