package baekjoon.practice;

import java.util.Scanner;

public class p1259 {
    static String solution(String[] arr) {
        String answer = "yes";
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (!arr[i].equals(arr[j])) {
                answer = "no";
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String tc = sc.nextLine();
            if (tc.equals("0")) break;
            System.out.println(solution(tc.split("")));
        }
    }
}
