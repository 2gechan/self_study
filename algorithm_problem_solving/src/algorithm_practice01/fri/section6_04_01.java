package algorithm_practice01.fri;

import java.util.ArrayList;
import java.util.Scanner;

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
