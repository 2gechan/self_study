package algorithm_practice01.tue.practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
뒤집은 소수
N개의 자연수가 입력되면 각 자연수를 뒤집은 후
그 뒤집은 수가 소수이면 그 소수를 출력하 는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다.
그러면 23을 출력한다.
단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.
 */
public class section2_06_01 {
    static List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            String tmp = "";
            while (n > 0) {
                tmp += String.valueOf(n % 10);
                n /= 10;
            }
            n = Integer.valueOf(tmp);
            if (n == 1 || n == 0) continue;
            boolean flag = true;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) list.add(n);
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(arr)) System.out.print(x + " ");
    }
}
