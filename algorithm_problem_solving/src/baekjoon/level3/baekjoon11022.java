package baekjoon.level3;

import java.io.*;
import java.util.StringTokenizer;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
public class baekjoon11022 {

    public static void main(String[] args) throws IOException {
//            Scanner scan = new Scanner(System.in);
//            int testCase = scan.nextInt();
//
//            for (int i = 0; i < testCase; i++) {
//                int num1 = scan.nextInt();
//                int num2 = scan.nextInt();
//                System.out.printf("Case #%d: %d + %d = %d\n", (i + 1), num1, num2, (num1 + num2));
//            }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i + 1) + ": " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
        }
        bw.close();
    }

}
