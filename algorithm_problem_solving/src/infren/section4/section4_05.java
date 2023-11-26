package infren.section4;

import java.util.*;

// 주어진 수들 중 세개를 더했을 때 k 번재로 큰수 구하기기
public class section4_05 {
    static int solution(int n, int k, int[] t) {
        int answer = 0;
        TreeSet<Integer> tSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    tSet.add(t[i] + t[j] + t[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : tSet) {
            cnt++;
            answer = x;
            if(cnt == k) break;
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
        System.out.println(solution(n, k, t));
    }
}
