package baekjoon.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;

public class Baekjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String name = line[0];
            String status = line[1];
            if (status.equals("enter")) set.add(name);
            else set.remove(name);
        }
        set.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }).forEach(x -> System.out.println(x));

    }
}
