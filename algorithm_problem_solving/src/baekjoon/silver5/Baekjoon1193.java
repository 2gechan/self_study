package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.valueOf(br.readLine());

        int levelBlockCnt = 1, prevCntSum = 0;
        while (true) {

            if (X <= prevCntSum + levelBlockCnt) {

                // 홀수
                if (levelBlockCnt % 2 == 1) {
                    System.out.println((levelBlockCnt - (X - prevCntSum - 1)) + "/" + (X - prevCntSum));
                }
                // 짝수
                else {
                    System.out.println((X - prevCntSum) + "/" + (levelBlockCnt - (X - prevCntSum - 1)));
                }
                break;
            }
            else {
                prevCntSum += levelBlockCnt;
                levelBlockCnt++;
            }
        }

    }
}
