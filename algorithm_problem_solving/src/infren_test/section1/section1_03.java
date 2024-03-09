package infren_test.section1;

import java.util.ArrayList;
import java.util.Scanner;

public class section1_03 {
    static String solution(String tc) {
        String answer = "";
        String[] arr = tc.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (answer.length() < arr[i].length()) {
                answer = arr[i];
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
