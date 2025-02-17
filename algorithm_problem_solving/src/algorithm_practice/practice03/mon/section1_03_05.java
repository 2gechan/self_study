package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_05 {

    static String solution(String line) {
        StringBuilder sb = new StringBuilder();

        int lt = 0, rt = line.length() - 1;
        char[] arr = line.toCharArray();
        while (lt < rt) {
            if (Character.isAlphabetic(arr[lt])
                    && Character.isAlphabetic(arr[rt])) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++; rt--;
            }
            else if (!Character.isAlphabetic(arr[lt])) lt++;
            else if (!Character.isAlphabetic(arr[rt])) rt--;
        }
        for (char c : arr) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
}
