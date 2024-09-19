package algorithm_practice.thu.practice02;

import java.util.*;

class Lecture implements Comparable<Lecture> {

    int money;
    int limit;

    public Lecture(int money, int limit) {
        this.money = money;
        this.limit = limit;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.limit - this.limit;
    }
}
public class section9_04_02 {
    static int solution(int n, int maxDay, List<Lecture> list) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);

        int j = 0;
        for (int i = maxDay; i > 0; i--) {
            for (; j < n; j++) {
                if (list.get(j).limit < i) break;
                pQ.offer(list.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Lecture> list = new ArrayList<>();
        int maxDay = 0;
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int limit = sc.nextInt();
            maxDay = Math.max(maxDay, limit);
            list.add(new Lecture(money, limit));
        }
        System.out.println(solution(n, maxDay, list));
    }
}
