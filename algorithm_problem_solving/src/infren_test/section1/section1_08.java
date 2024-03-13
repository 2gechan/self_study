package infren_test.section1;

import java.util.Scanner;

public class section1_08 {
    static String solution(String tc) {
        String answer = "YES";
        String[] arr = tc.split("");
        int lt = 0, rt = arr.length - 1;
        while (lt < rt) {
            char l = Character.toLowerCase(arr[lt].charAt(0));
            char r = Character.toLowerCase(arr[rt].charAt(0));
            if (!Character.isAlphabetic(l)) {
                lt++;
                continue;
            }
            if (!Character.isAlphabetic(r)) {
                rt--;
                continue;
            }
            if (!(l == r)) {
                answer = "NO";
                break;
            }
            else lt ++; rt --;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
