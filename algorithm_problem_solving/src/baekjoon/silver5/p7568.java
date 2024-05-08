package baekjoon.silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    int w;
    int h;

    public Person(int w, int h) {
        this.w = w;
        this.h = h;
    }
}
public class p7568 {

    static int n;
    static int[] solution(List<Person> list) {
        int[] result = new int[n];
        for (int i = 0; i < list.size(); i++) {
            Person tmp = list.get(i);
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i == j) continue;
                if (tmp.w < list.get(j).w && tmp.h < list.get(j).h) {
                    rank++;
                }
            }
            result[i] = rank;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            list.add(new Person(w, h));
        }
        for (int x: solution(list)) System.out.print(x + " ");

    }
}
