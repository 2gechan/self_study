package infren_test.section1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class section1_04 {
    static void solution(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            System.out.println(sb);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        solution(arr);
    }
}
