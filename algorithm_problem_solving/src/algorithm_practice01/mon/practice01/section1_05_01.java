package algorithm_practice01.mon.practice01;

import java.util.Scanner;

/*
특정 문자 뒤집기
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class section1_05_01 {
    static String solution(String testCase) {
        StringBuilder sb = new StringBuilder();
        char[] arr = testCase.toCharArray();
        int lt = 0, rt = arr.length - 1;
        while (lt < rt) {
            if (Character.isAlphabetic(arr[lt]) &&
                    Character.isAlphabetic(arr[rt])) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
            else if (!Character.isAlphabetic(arr[lt])) lt++;
            else if (!Character.isAlphabetic(arr[rt])) rt--;
        }
        for (char x : arr) sb.append(x);

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
