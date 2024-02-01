package infren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Body implements Comparable<Body> {
    int k;
    int w;
    public Body(int k, int w) {
        this.k = k;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        // 음수를 가리키게 만들면 내림차순
        // 양수는 오름차순
        // 좌표 지정 알고리즘 학습하기
        return o.k - this.k;
    }
}

// 그리디 알고리즘, 최선의 방법을 찾는 알고리즘
// 자신의 키와 몸무게가 하나라도 최고 값이 넘어가지 않는 인원들을 뽑기
// 키순으로 정렬 후 몸무게를 맥스값을 구해가며 구하는 방법
public class section9_01 {

    static void solution(ArrayList<Body> arr, int n) {
        int cnt = 0;;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body o : arr) {
            if (o.w > max) {
                max = o.w;
                cnt++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(k, w));
        }
        solution(arr, n);

    }
}
