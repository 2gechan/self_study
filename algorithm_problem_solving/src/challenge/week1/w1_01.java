package challenge.week1;

import java.util.Arrays;
import java.util.Scanner;

public class w1_01 {
    // n 번 난쟁이가 포함되었는지 체크하는 배열
    static int[] ch = new int[9];
    // 난쟁이들 키의 합이 100인 난쟁이들 조합
    static int[] result = new int[7];
    // 난쟁이들의 키를 입력받을 배열
    static int[] arr = new int[9];
    // 조합을 찾은 경우 DFS 탐색을 더이상 진행하지 않기 위한 flag
    static boolean flag = false;


    // l은
    static void solution(int l, int index, int sum) {
        if (flag) return;
        if (l == 7) {
            if (sum == 100) {
                flag = true;
                Arrays.sort(result);
                for (int x : result) System.out.println(x);
            }
        }else {
            for (int i = 0; i < 9; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    result[index] = arr[i];
                    solution(l + 1, index + 1, sum + arr[i]);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        solution(0, 0, 0);
    }
}
