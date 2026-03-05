package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Baekjoon10814 implements Comparable<Baekjoon10814> {
    int num;
    int age;
    String name;

    public Baekjoon10814(int num, int age, String name) {
        this.num = num;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Baekjoon10814 o) {
        if (this.age == o.age) return this.num - o.num;
        else return this.age - o.age;
    }
}

public class Silver10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        List<Baekjoon10814> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Baekjoon10814(i, age, name));
        }
        Collections.sort(list);

        for (Baekjoon10814 b : list) {
            System.out.println(b.age + " " + b.name);
        }

    }
}
