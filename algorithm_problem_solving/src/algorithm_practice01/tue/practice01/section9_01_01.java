package algorithm_practice01.tue.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Body implements Comparable<Body> {
    int height;
    int weight;

    @Override
    public int compareTo(Body o) {
        return o.weight - this.weight;
    }

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
}

/*
그리디 알고리즘
자신보다 몸무케와 키가 둘다 큰 사람이 존재하면 대상 X

몸무게나 키 둘중 하나를 내림차순으로 정렬 후
제일 큰 값을 max 값에 갱신해주며 구해준다.
 */
public class section9_01_01 {

    static int solution(List<Body> list) {
        int answer = 0;
        int maxHeight = Integer.MIN_VALUE;
        Collections.sort(list);
        for (Body o : list) {
            if (o.height > maxHeight) {
                answer++;
                maxHeight = o.height;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Body> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Body(h, w));
        }
        System.out.println(solution(list));
    }
}