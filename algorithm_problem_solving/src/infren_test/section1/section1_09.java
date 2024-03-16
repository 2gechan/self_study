package infren_test.section1;

import java.util.Scanner;

public class section1_09 {
    static int solution(String tc) {
        String strInteger = "";
        int answer = 0;
        String[] arr = tc.split("");
        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i].charAt(0))) continue;
            else strInteger += arr[i];
        }
        answer = Integer.parseInt(strInteger);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
