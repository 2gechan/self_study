package challenge.week2;

import java.util.Scanner;

public class w2_02 {
    static int[] coins = {500, 100, 50, 10, 5, 1};
    static int solution(int price) {
        int changeMoney = 1000 - price;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];
            while (changeMoney >= coin) {
                changeMoney -= coin;
                count++;
            }
        }

        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        System.out.println(solution(price));
    }
}
