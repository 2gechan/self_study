package baekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 입력 받은 대로 출력하는 프로그램을 작성하시오.
public class baekjoon11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // List<String> strList = new ArrayList<>();

        while (true) {
            String testCase = br.readLine();
            if (testCase.isBlank()) {
                break;
            }

            System.out.println("testCase = " + testCase);
        }
    }

}
