package algorithm_practice.practice03.tue;

import java.util.*;

class Lecture implements Comparable<Lecture> {
    int money;
    int day;

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }
}

public class section9_03_04 {

    static int solution(List<Lecture> list, int maxDay) {
        int answer = 0;

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        Collections.sort(list);

        int j = 0;
        for (int i = maxDay; i > 0; i--) {

            for (; j < list.size(); j++) {
                if (list.get(j).day < i) break;
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
            int day = sc.nextInt();
            maxDay = Math.max(maxDay, day);
            list.add(new Lecture(money, day));
        }
        System.out.println(solution(list, maxDay));
    }
}
