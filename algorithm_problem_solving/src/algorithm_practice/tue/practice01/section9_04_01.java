package algorithm_practice.tue.practice01;

import java.util.*;

/*
최대 수입 스케쥴(PriorityQueue 응용문제)
N개의 기업에서 강연 요청을 했다.
각 기업은 D일 안에 와서 강연을 해주면 M만큼의 강연료를 주기로 했다.
하루에 한개의 강연만 할 수 있고 가장 많은 돈을 벌 수 있는 강연 스케줄 짜기
 */
class Lecture implements Comparable<Lecture>{
    int money;
    int day;

    @Override
    public int compareTo(Lecture o) {
        return o.day - this.day;
    }

    public Lecture(int money, int day) {
        this.money = money;
        this.day = day;
    }
}
public class section9_04_01 {

    static int solution(int n, int maxDay, List<Lecture> list) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(list);

        // list에서 마지막으로 찾은 인덱스 위치(날짜별)를 기억하기 위해 밖에서 j값을 선언
        int j = 0;
        for (int i = maxDay; i > 0; i--) {
            for (; j < n; j++) {
                // 제한 날짜 별로 뽑기
                // ex) 3일안에 해야하는 강연, 2일안에 해야하는 강연, 1일안에 해야하는 강연
                // 내림차순으로 한 이유는 제일 마지막에 가도 되는 강연 중 가장 높은 강연료를
                // 선택해야 하기 때문에 나중 날짜에서 부터 한개씩 뽑는다.
                if (list.get(j).day < i) break;
                pQ.offer(list.get(j).money);
            }
            // 가장 큰 강연료 뽑기
            if (!pQ.isEmpty()) answer += pQ.poll();
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxDay = 0;
        List<Lecture> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int money = sc.nextInt();
            int day = sc.nextInt();
            maxDay = Math.max(maxDay, day);
            list.add(new Lecture(money, day));
        }
        System.out.println(solution(n, maxDay, list));
    }
}
