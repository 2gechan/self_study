package algorithm_practice.mon.practice02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section1_02_02 {
    static String solution(String word) {
        String answer = "";

        for (char x : word.toCharArray()) {
            if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // a : 97, A : 65
         String word = br.readLine();
         System.out.println(solution(word));

    }
}
