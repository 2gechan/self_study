package baekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
public class baekjoon2743 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCase = br.readLine();
        System.out.println(testCase.length());
    }
}
