package infren.section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int pay; // 강연비
    int limit; // 제한일

    public Lecture(int pay, int limit) {
        this.pay = pay;
        this.limit = limit;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.limit - this.limit;
    }
}

// 최대 수입 스케쥴, 그리디 알고리즘
// PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
// reverseOrder 를 넣고 생성시 내림차순으로 정렬되어 값을 넣을때마다 큰 순서로 정렬
// 넣지 않으면 오름차순 default
public class section9_04 {

    static int n, max = Integer.MIN_VALUE;

    static int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if (arr.get(j).limit < i) break;
                pQ.offer(arr.get(j).pay);
            }
            if (!pQ.isEmpty()) {
                answer += pQ.poll();;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int l = sc.nextInt();
            arr.add(new Lecture(p, l));
            max = Math.max(max, l);
        }
        System.out.println(solution(arr));
    }
}
