package baekjoon.Bronze;

import java.util.Arrays;
import java.util.Scanner;

public class 음계 {
    public static void main(String[] args) {
//        c d e f g a b C, 총 8개 음으로 이루어져있다.
//        c는 1로, d는 2로, ..., C를 8

//        c = 1, d = 2, e = 3, f= 4, g= 5, a = 6, b = 7, C = 8
//        ascending, descending, mixed

        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};

        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[8];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }

        if(Arrays.equals(intArr, ascending)) {
            System.out.println("ascending");
        }else if(Arrays.equals(intArr, descending)) {
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }
    }

}
