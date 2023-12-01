package infren.section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 필수과목을 순서대로 이수했는지 검증하는 알고리즘
// CBA를 꼭 이수해야 하는 상황에서
// ex) C E B D F A -> 옳은 과목 과정
// C를 이수해야 B를 수강할 수 있고 B를 이수해야 A를 수강할 수 있다.
public class section5_07 {
    static String solution(String t, String tc) {
        Queue<Character> q = new LinkedList<>();
        for (char x : t.toCharArray()) {
            q.offer(x);
        }
        for (char x : tc.toCharArray()) {
            if (q.contains(x)) {
                if (q.poll() != x) return "NO";
            }
        }
        if (!q.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        String tc = sc.nextLine();
        System.out.println(solution(t, tc));
    }
}
