package baekjoon.Bronze;
import java.util.Scanner;

public class OX퀴즈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //반복 횟수
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(strMethod(str));
        }
    }
    public static int strMethod(String str) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'O') {
                result += count;
                count++;
            } else {
                count = 1;
            }
        }
        return result;
    }
}





