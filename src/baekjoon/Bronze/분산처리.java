package baekjoon.Bronze;

import java.util.Scanner;

public class 분산처리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = 1;


            a = a % 10;

            for (int i = 0; i < b; i++) {
                result = (result * a) % 10;
                System.out.println(i);
                if (result == 0)
                    result = 10;
            }
            System.out.println(result);
        }
    }
}