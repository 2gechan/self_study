package infren.section4;

import java.util.*;

// 매출액 종류 구하기
public class section4_03 {
    static List<Integer> solution(int n, int k, int[] t) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(t[i], map.getOrDefault(t[i], 0) + 1);
        }
        answer.add(map.size());
        int lt = 0;
        for (int rt = k; rt < n; rt++) {
            map.put(t[rt], map.getOrDefault(t[rt], 0) + 1);
            map.put(t[lt], map.get(t[lt]) - 1);
            if (map.get(t[lt]) == 0) map.remove(t[lt]);
            answer.add(map.size());
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        for (int x : solution(n, k, t)) {
            System.out.print(x + " ");
        }
    }
}
