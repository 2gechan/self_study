package baekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
public class baekjoon27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String testCase = br.readLine();
        int index = Integer.parseInt(br.readLine());
        String result = testCase.substring(index-1, index);
        System.out.println(result);

    }
}
