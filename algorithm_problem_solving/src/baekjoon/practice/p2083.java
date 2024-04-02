package baekjoon.practice;

import java.util.Scanner;

public class p2083 {
    static String solution(String[] arr) {
        String answer = "";
        if (Integer.parseInt(arr[1]) > 17 || Integer.parseInt(arr[2]) >= 80) {
            answer = "Senior";
        }
        else {
            answer = "Junior";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String[] tc = sc.nextLine().split(" ");
            if (tc[0].equals("#") && tc[1].equals("0") && tc[2].equals("0")) break;
            System.out.println(tc[0] + " " + solution(tc));
        }
    }
}
