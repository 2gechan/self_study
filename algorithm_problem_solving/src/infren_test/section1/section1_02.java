package infren_test.section1;

import java.util.Scanner;

public class section1_02 {
    static String solution(String tc) {
        String answer = "";
        for (int i = 0; i < tc.length(); i++) {
            char c = tc.charAt(i);

            if (c >= 97 && c <= 122) answer += (char) (c - 32);
            else answer += (char) (c + 32);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
        // a = 97, z = 122
        // A = 65, Z = 90
    }
}
