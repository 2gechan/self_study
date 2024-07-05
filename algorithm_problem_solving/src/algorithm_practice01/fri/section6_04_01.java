package algorithm_practice01.fri;

import java.util.ArrayList;
import java.util.Scanner;

/*
Least Recently Used
캐시메모리는 CPU와 주기억장치(DRAM) 사이의
고속의 임시 메모리로서 CPU가 처리할 작업을 저장해 놓았다가
필요할 바로 사용해서 처리속도를 높이는 장치이다.
워낙 비싸고 용량이 작아 효율적으로 사용해야 한다.
철수의 컴퓨터는 캐시메모리 사용 규칙이 LRU 알고리즘을 따른다.
LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면
가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.
캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.
만약 캐시의 사이즈가 5이고 작업이 2 3 1 6 7 순으로 저장되어 있다면,

1) Cache Miss : 해야할 작업이 캐시에 없는 상태로 위 상태에서
만약 새로운 작업인 5번 작업을 CPU가 사용한다면 Cache miss가 되고
모든 작업이 뒤로 밀리고 5번작업은 캐시의 맨 앞에 위치한다.
5 2 3 1 6
2) Cache Hit : 해야할 작업이 캐시에 있는 상태로 위 상태에서 만약 3번 작업을 CPU가 사용
한다면 Cache Hit가 되고, 3번 앞에 있는 5, 2번 작업은 한 칸 뒤로 밀리고, 3번이 맨 앞으로
위치하게 된다. 5 2 3 1 6 ---> 3 5 2 1 6
캐시의 크기가 주어지고, 캐시가 비어있는 상태에서
N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요.
 */
public class section6_04_01 {
    static ArrayList<Integer> solution(int s, int[] works) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < works.length; i++) {
            int work = works[i];
            if (answer.contains(work)) {
                answer.remove(work);
                answer.add(0, work);
            }
            else {
                if (answer.size() == s) {
                    answer.remove(s - 1);
                }
                answer.add(0, work);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] works = new int[n];
        for (int i = 0; i < n; i++) {
            works[i] = sc.nextInt();
        }
        for (int x : solution(s, works)) System.out.print(x + " ");
    }
}
