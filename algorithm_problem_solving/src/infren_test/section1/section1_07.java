package infren_test.section1;

import java.util.Scanner;

public class section1_07 {
    static String solution(String str) {
        String answer = "YES";
        int lt = 0, rt = str.length() - 1;
        String[] arr = str.split("");
        while (lt < rt) {
            if (!arr[lt].equals(arr[rt])) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        tc = tc.toLowerCase();

        System.out.println(solution(tc));
    }
}
