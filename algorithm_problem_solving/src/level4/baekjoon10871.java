package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
// 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
// 째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
// 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
public class baekjoon10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strSettingNum = br.readLine().split(" ");
        int[] numArr = new int[Integer.parseInt(strSettingNum[0])];
        List<Integer> searchArr = new ArrayList<Integer>();
        int mainNum = Integer.parseInt(strSettingNum[1]);

        String[] strNumArr = br.readLine().split(" ");
        for (int i = 0; i < strNumArr.length; i++) {
            numArr[i] = Integer.parseInt(strNumArr[i]);
            if (mainNum > numArr[i]) {
                searchArr.add(numArr[i]);
            }
        }
        for (int i = 0; i < searchArr.size(); i++) {
            System.out.print(searchArr.get(i) + " ");
        }

    }
}
