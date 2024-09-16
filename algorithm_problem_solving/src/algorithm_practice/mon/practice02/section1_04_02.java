package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section1_04_02 {
    static String[] solution(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String tmp = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                tmp += word.charAt(j);
            }
            arr[i] = tmp;
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for (String s : solution(arr)) System.out.println(s);
    }
}
