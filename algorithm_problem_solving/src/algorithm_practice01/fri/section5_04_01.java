package algorithm_practice01.fri;

import java.util.Scanner;
import java.util.Stack;

public class section5_04_01 {
    static int solution(String testCase) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : testCase.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(Integer.valueOf(String.valueOf(x)));
            }
            else {
                int a = stack.pop();
                int b = stack.pop();
                int tmp = 0;
                if (x == '*') tmp = b * a;
                else if (x == '-') tmp = b - a;
                else if (x == '+') tmp = b + a;
                else if (x == '/') tmp = b / a;
                stack.push(tmp);
                }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testCase = sc.nextLine();
        System.out.println(solution(testCase));
    }
}
