package practice.mon;

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toLowerCase();
        char target = sc.nextLine().charAt(0);

        int cnt = 0;
        for (char c : line.toCharArray()) {
            if (c == target) cnt++;
        }
        System.out.println(cnt);
    }
}
