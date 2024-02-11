package baekjoon.Bronze;

import java.util.Scanner;

public class 숫자의_개수 {


    public static void main(String[] args) {
        int[] numArr = new int[10];
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        long total = A * B * C;
        String str = Long.toString(total);
        String[] parts = str.split("");
        for (String part : parts) {
           numArr[Integer.parseInt(part)]++;
        }
        for (int i : numArr) {
            System.out.println(i);
        }


    }
}
