package algorithm_practice.practice03.mon;

import java.util.Scanner;

public class section1_03_08 {

    static String solution(String line) {

        int lt = 0, rt = line.length() - 1;
        String lowerCase = line.toLowerCase();
        while (lt <= rt) {
            char l = lowerCase.charAt(lt);
            char r = lowerCase.charAt(rt);
            if (!Character.isAlphabetic(l)) lt++;
            else if (!Character.isAlphabetic(r)) rt--;
            else {
                if (l != r) return "NO";
                lt++;
                rt--;
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        System.out.println(solution(line));
    }
}
