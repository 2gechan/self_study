package level3;

import java.io.*;
import java.util.Scanner;

// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 입력의 마지막에는 0 두 개가 들어온다.
public class baekjoon10952 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String[] nums = br.readLine().split(" ");
            int numA = Integer.parseInt(nums[0]);
            int numB = Integer.parseInt(nums[1]);
            bw.write(numA + numB);
            if(numA == 0 && numB == 0) {
                break;
            }

        }
        bw.flush();
    }

}
