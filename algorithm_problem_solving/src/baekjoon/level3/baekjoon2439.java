package baekjoon.level3;

import java.io.*;

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
public class baekjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nCount = Integer.parseInt(br.readLine());
        for (int i = 1; i <= nCount; i++) {
            bw.write(" ".repeat(nCount-i));
            bw.write("*".repeat(i) + "\n");
        }
        bw.close();
    }
}
