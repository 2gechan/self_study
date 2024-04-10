package infren_test.section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_04 {
    static int solution(String tc) {
        Stack<Integer> stack = new Stack<>();
        for (char x : tc.toCharArray()) {
            if (Character.isDigit(x)) stack.push(Integer.valueOf(String.valueOf(x)));
            else {
                int a = stack.pop(), b = stack.pop();
                if (x == '+') stack.push(b + a);
                else if (x == '*') stack.push(b * a);
                else if (x == '-') stack.push(b - a);
                else if (x == '/') stack.push(b / a);
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
