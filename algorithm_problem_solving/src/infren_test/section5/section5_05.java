package infren_test.section5;

import java.util.Scanner;
import java.util.Stack;

public class section5_05 {
    static int solution(String tc) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < tc.length(); i++) {
            if (tc.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if (tc.charAt(i - 1) == '(') answer += stack.size();
                else {
                    answer++;
                }
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
