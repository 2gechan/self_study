package baekjoon.silver5;

public class p4673 {
    static int d(int number) {
        int sum = number;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 1;
        boolean[] ch = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int rtn = d(i);
            if (rtn <= 10000) ch[rtn] = true;

        }
        for (int i = 1; i < 10001; i++) {
            if (!ch[i]) System.out.println(i);
        }

    }
}
