package infren.section5;

import java.util.Scanner;
import java.util.Stack;

// stack을 이용한 후위연산자 계산하기
public class section5_04 {
    static int solution(String t) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (char x : t.toCharArray()) {
            // 문자 '0'은 아스키코드로 변환했을 때 48 이라서 빼줘야한다.
            // ex '0'일 때 48 - 48 = 0, '1'일때 49 - 48 = 1
            if (Character.isDigit(x)) stack.push(x - 48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                switch (x) {
                    case '+':
                        stack.push(lt + rt);
                        break;
                    case '-':
                        stack.push(lt - rt);
                        break;
                    case '*':
                        stack.push(lt * rt);
                        break;
                    case '/':
                        stack.push(lt / rt);
                        break;
                }
            }
        }
        answer = stack.pop();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(solution(t));
    }
}
