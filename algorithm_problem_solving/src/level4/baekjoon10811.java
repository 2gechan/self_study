package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
// 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니,
// 그 다음 바구니를 2번째 바구니, ..., 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
// 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다.
// 도현이는 한 번 순서를 역순으로 바꿀 때, 순서를 역순으로 만들 범위를 정하고,
// 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
// 바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음,
// 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
public class baekjoon10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strParse = br.readLine().split(" ");
        int basketCount = Integer.parseInt(strParse[0]);
        int[] basket = new int[basketCount];
        int shuffleCount = Integer.parseInt(strParse[1]);

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < shuffleCount; i++) {
            strParse = br.readLine().split(" ");
            int sIndex = Integer.parseInt(strParse[0]);
            int eIndex = Integer.parseInt(strParse[1]);
            int[] temp = new int[eIndex - sIndex + 1];
            int ex = 0;
            for (int j = eIndex - 1; j >= sIndex-1; j--) {

                temp[ex++] = basket[j];
            }
            ex=0;
            for (int k = sIndex - 1; k < eIndex; k++) {
                basket[k] = temp[ex++];
            }

        }
        for (int item : basket) {
            System.out.println(item);
        }


    }
}
