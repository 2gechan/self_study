package infren_test.section9;

import java.util.*;

class Lecture implements Comparable<Lecture> {
    int cost;
    int limit;

    @Override
    public int compareTo(Lecture o) {
        return o.limit - this.limit;
    }

    public Lecture(int cost, int limit) {
        this.cost = cost;
        this.limit = limit;
    }
}
public class section9_04 {
    static int max = 0, n;
    static int solution(List<Lecture> list) {
        int answer = 0;

        // PriorityQueue의 default 는 poll 했을 때 가장 작은 수부터 나온다
        // Collections.reverseOrder 를 사용할 경우 큰 값 부터 poll
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (list.get(j).limit < i) break;
                pQ.offer(list.get(j).cost);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Lecture> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cost = sc.nextInt();
            int limit = sc.nextInt();
            max = Math.max(max, limit);
            list.add(new Lecture(cost, limit));
        }
        System.out.println(solution(list));
    }
}
