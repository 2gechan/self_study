package algorithm_practice.practice03.fri;

import java.util.Scanner;
import java.util.Stack;

public class section5_03_04 {

    static int solution(String line) {

        Stack<Integer> stack = new Stack<>();

        for (char c : line.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            }
            else {
                int last = stack.pop();
                int first = stack.pop();
                if (c == '+') {
                    stack.push(last + first);
                }
                else if (c == '-') {
                    stack.push(first - last);
                }
                else if (c == '*') {
                    stack.push(first * last);
                }
                else stack.push(first / last);
            }
        }

        return stack.pop();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
}
