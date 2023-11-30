package infren.section5;

import java.util.Scanner;
import java.util.Stack;

// stack을 이용하여 레이저로 쇠막대기를 잘랐을 때 잘린 개수
// 괄호가 열리고 닫히고 바로 붙어있는 경우는 레이저'()'
// 바로 붙어 있지 않은 경우 '('는 쇠막대기의 시작 지점 ')'는 종료 지점
public class section5_05 {
    static int solution(String t) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i<t.length(); i++) {
            if (t.charAt(i) == '(') stack.push(t.charAt(i));
            else {
                stack.pop();
                if (t.charAt(i-1) == '(') count += stack.size();
                else count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(solution(t));
    }
}
