package level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 S를 입력받은 후에,
// 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
// 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다.
// S에는 QR Code "alphanumeric" 문자만 들어있다.
// QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
public class baekjoon2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCaseCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCaseCount; i++) {
            String[] testCaseArr = br.readLine().split(" ");
            int repeatCount = Integer.parseInt(testCaseArr[0]);
            String testCase = testCaseArr[1];
            for (int j = 0; j < testCase.length(); j++) {
                for (int z = 0; z < repeatCount; z++) {
                    System.out.print(testCase.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
