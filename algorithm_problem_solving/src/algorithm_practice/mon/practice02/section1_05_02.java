package algorithm_practice.mon.practice02;

import java.util.Scanner;

public class section1_05_02 {
    static String solution(String word) {
        char[] arr = word.toCharArray();
        int lt = 0, rt = word.length() - 1;
        while (lt < rt) {
            if (Character.isAlphabetic(arr[lt])
                    && Character.isAlphabetic(arr[rt])) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++; rt--;
            }
            if (!Character.isAlphabetic(word.charAt(lt))) lt++;
            if (!Character.isAlphabetic(word.charAt(rt))) rt--;
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(solution(word));
    }
}
