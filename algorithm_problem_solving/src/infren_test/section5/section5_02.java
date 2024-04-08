package infren_test.section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_02 {
    static String solution(String tc) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : tc.toCharArray()) {
            if (x == '(') stack.push(x);
            else if(x == ')') stack.pop();
            else {
                if (stack.isEmpty()) answer += x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        System.out.println(solution(tc));
    }
}
