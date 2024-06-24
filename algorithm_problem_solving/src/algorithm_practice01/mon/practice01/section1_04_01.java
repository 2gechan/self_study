package algorithm_practice01.mon.practice01;

import java.util.Scanner;

/*
단어 뒤집기
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
단어는 영어 알파벳으로만 구성되어 있습니다.
 */
public class section1_04_01 {
    static String[] solution(String[] arr) {
        /*
        for (int i = 0; i < arr.length; i++) {
            String tmp = "";
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                tmp += arr[i].charAt(j);
            }
            arr[i] = tmp;
        }
        */
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            arr[i] = sb.toString();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        for (String x : solution(arr)) System.out.println(x);
    }
}
