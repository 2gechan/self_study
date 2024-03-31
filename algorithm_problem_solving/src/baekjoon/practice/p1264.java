package baekjoon.practice;

import java.util.Scanner;

public class p1264 {
    static char[] arr = {'a', 'e', 'i', 'o', 'u'};

    static int solution(String t) {
        int answer = 0;
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Character.toLowerCase(t.charAt(i)) == arr[j]) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String t = sc.nextLine();
            if (t.equals("#")) break;
            System.out.println(solution(t));

        }
    }
}
