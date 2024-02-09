package programmers.Exhaustive_Search;

public class solution_1 {
//    완전탐색 > 최소직사각형
    public static void main(String[] args) {
        int[][] cards = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        };
        int widthMax = 0;
        int hightMax = 0;

        for (int[] card : cards) {
            int max = Math.max(card[0], card[1]);
            int min = Math.min(card[0], card[1]);


            widthMax = Math.max(widthMax, max);
            hightMax = Math.max(hightMax, min);

        }
        System.out.println(widthMax * hightMax);

    }

}