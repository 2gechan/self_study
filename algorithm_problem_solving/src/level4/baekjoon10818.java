package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
// 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
public class baekjoon10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] numArr = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        int maxNum = 0;
        int minNum = 1000000;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] > maxNum) {
                maxNum = numArr[i];
            }
            if (numArr[i] < minNum) {
                minNum = numArr[i];
            }
        }
        System.out.printf("%d %d", minNum, maxNum);
    }
}
