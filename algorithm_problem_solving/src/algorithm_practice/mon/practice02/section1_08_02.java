package algorithm_practice.mon.practice02;

import java.util.Scanner;

// 유효한 팰린드롬
public class section1_08_02 {

    static String solution(String tc) {
        String answer = "YES";
        tc = tc.toLowerCase();
        char[] arr = tc.toCharArray();
        int lt = 0, rt = arr.length - 1;
        while (lt < rt) {

            if (!Character.isAlphabetic(arr[lt])) lt++;
            else if (!Character.isAlphabetic(arr[rt])) rt--;
            else {
                if (arr[lt] != arr[rt]) return "NO";
                lt++;
                rt--;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
