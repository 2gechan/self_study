package swea.d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class d2_1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(br.readLine());
        int[] result = new int[testCount];
        for (int i = 0; i < testCount; i++) {
            int[] scoreList = new int[101];
            for (int s = 0; s < scoreList.length; s++) {
                scoreList[s] = 0;
            }
            int testCaseNum = Integer.parseInt(br.readLine());
            String[] strTestCase = br.readLine().split(" ");
            for (int j = 0; j < strTestCase.length; j++) {
                int num = Integer.parseInt(strTestCase[j]);
                scoreList[num]++;
            }

            int manyNum = 0;
            int manyNumxIndex = 0;
            for (int x = 0; x < scoreList.length; x++) {
                if (scoreList[x] >= manyNum) {
                    manyNumxIndex = x;
                    manyNum = scoreList[x];
                }
            }
            result[i] = manyNumxIndex;

        }

        for (int i = 0; i < result.length; i++) {
            System.out.printf("#%d %d\n",i+1, result[i]);
        }
    }

}
