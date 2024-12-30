package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_02 {
    static String solution(String word) {
        String answer = "";

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else answer += Character.toUpperCase(c);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
    }
}
