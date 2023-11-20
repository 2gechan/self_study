package baekjoon.level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
// 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
public class baekjoon11654 {
    public static void main(String[] args) throws IOException {
        // A = 65, 0 = 48, a = 97
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char strAscii = br.readLine().charAt(0);
        int ascii = (int) strAscii;
        System.out.printf("%s = %s",strAscii, ascii);
    }
}
