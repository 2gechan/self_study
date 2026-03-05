package practice.tue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Person implements Comparable<Person> {

    int height;
    int weight;

    public Person(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person o) {
        return o.height - this.height;
    }
}
public class Greedy1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            list.add(new Person(height, weight));
        }
        Collections.sort(list);
        int cnt = 0;
        int weight = 0;
        for (Person p : list) {
            if (p.weight > weight) {
                weight = p.weight;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
