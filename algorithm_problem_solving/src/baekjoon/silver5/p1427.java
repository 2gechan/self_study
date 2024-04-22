package baekjoon.silver5;

import java.util.Scanner;

public class p1427 {
    static String solution(String n) {
        String answer = "";
        String[] strArr = n.split("");
        int[] arr = new int[n.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            answer += arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(solution(n));
    }
}
