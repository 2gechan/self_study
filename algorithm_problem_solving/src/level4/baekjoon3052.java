package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
// 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
// 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.

// ** HashSet 사용시 굉장히 간편해짐 HashSet은 중복값은 저장하지 않는다.
public class baekjoon3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] resultList = new int[10];
        for (int i = 0; i < resultList.length; i++) {
            int number = Integer.parseInt(br.readLine());

            resultList[i] = number % 42;
        }
        for (int j=0; j<resultList.length-1; j++) {
            for (int i = j+1; i < resultList.length; i++) {
                if (resultList[j] == resultList[i]) {
                    resultList[i] = -1;
                }
            }
        }
        int count = 0;
        for (int item : resultList) {

            if (item != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
