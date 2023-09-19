package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
public class baekjoon9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCount; i++) {
            String testCase = br.readLine();
            System.out.print(testCase.substring(0, 1));
            System.out.println(testCase.substring(testCase.length()-1));
        }


    }
}
