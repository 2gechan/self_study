package baekjoon.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
    String name;
    int kor;
    int eng;
    int math;

    @Override
    public int compareTo(Person o) {

        if (this.kor == o.kor) {
            if (this.eng == o.eng) {
                if (this.math == o.math) {
                    return this.name.compareTo(o.name);
                }
                return o.math - this.math;
            }
            return this.eng - o.eng;
        }
        return o.kor - this.kor;
    }

    public Person(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class Silver10825 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Person(
                    st.nextToken(),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
                    )
            );
        }

        Collections.sort(list);

        for (Person p : list) {
            System.out.println(p.name);
        }
    }
}
