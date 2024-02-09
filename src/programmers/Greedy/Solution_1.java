package programmers.Greedy;

import java.util.Stack;


public class Solution_1 {

    public static void main(String[] args) {
        String result = "";
        String number = "28919";
        int k = 2;

        Stack<Integer> stackInt = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            int num = Character.getNumericValue(number.charAt(i));
            //System.out.println(num); //stack 에 저장될 순서 [ 1,9,2,4 ]

            //같은 수 일 경우에는 무시해줘도 됨
            //큰 수일 경우에만


            //k=2,1 두번 반복 0일 경우 while 탈출
            //? 만약 K 의 횟수가 남아있는데 k = 0 이 되지 않는다면?
            //9,4

            while (!stackInt.isEmpty() && stackInt.peek() < num && k > 0) {
                stackInt.pop();
                k--;
            }

            //1231234
            //k =3 // 2
            //stack =[1]
           //stack = [1,2] -> stack = [2] 1제거 // k--;3
            //stack = [3,] -> stack = [3] 2제거 // k--;2
            //stack = [3, 1] -> stack = [3] 1제거 // k--;1
            //stack =[3,2,3,4] -> k종료
            //num = 1,9,2,4
            //1. while 의 isempty = false stack = [1 ]
            //2. 1 vs 9 -> 9 저장 // 1 제거
            //3.  stackInt.peek() < num = false 이기 떄문에 stack = [9, 4, ] ->
            //4. k > 0 가 이제 0 이여서 false for 문 종료

            stackInt.push(num);


//            if (!stackInt.isEmpty() && num < stackInt.peek()) {
//
//                //1번쨰 는 실행 X
//                //2번째부터 1 vs 9 이면 9 stack에 9 저장
//
//            } else {
//                stackInt.add(num);
//                //stack 에 1 저장
//                //반복 횟수? k번만 진행
//            }


        }

        StringBuilder sb = new StringBuilder();

        for (Integer i : stackInt) {
            sb.append(i);
        }

        String strArrayToString = sb.toString();

//        return strArrayToString;
        System.out.println(strArrayToString);


//        if (strArrayToString instanceof String) {
//            System.out.println("문자열 맞음");
//        }


    }


}
