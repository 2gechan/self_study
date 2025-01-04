package algorithm_practice.practice03.fri;

import java.util.Scanner;
import java.util.Stack;

public class section5_03_02 {

    static String solution(String line) {

        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        for (char c : line.toCharArray()) {
            if (c == ')') {
                while (true) {
                    char tmp = stack.pop();
                    if (tmp == '(') break;
                }
            } else stack.push(c);
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
}
