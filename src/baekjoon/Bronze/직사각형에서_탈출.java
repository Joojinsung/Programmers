package baekjoon.Bronze;

import java.util.Scanner;

public class 직사각형에서_탈출 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int minDistance = 0;

        int xMin = Math.min(x, w-x);
        int yMin = Math.min(y, h-y);

        minDistance = Math.min(xMin, yMin);


        System.out.println(minDistance);
    }
}
