package baekjoon.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11655 {

    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static String solution(String testCase) {
        String answer = "";

        for (char c : testCase.toCharArray()) {

            if (Character.isAlphabetic(c)) {
                boolean upDownFlag = Character.isUpperCase(c); // 대문자인지 확인, 소문자일 경우 false
                int position = alphabet.indexOf(String.valueOf(Character.toUpperCase(c))) + 13;
                if (position >= alphabet.length()) position %= 13;
                if (!upDownFlag) answer += Character.toLowerCase(alphabet.charAt(position));
                else answer += alphabet.charAt(position);
            } else answer += c;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCase = br.readLine();
        System.out.println(solution(testCase));
    }
}
