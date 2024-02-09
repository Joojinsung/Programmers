//package Greedy;
//
//public class Solution_2 {
//
////   0 : A, 1 : B, 2 : C, 3 : D, 4 : E, 5 : F, 6 : G, 7 : H, 8 : I, 9 : J, 10 :
////   K, 11 : L, 12 : M, 13 : N, 14 : O, 15 : P, 16 : Q, 17 : R, 18 : S, 19 :
////   T, 20 : U, 21 : V, 22 : W, 23 : X, 24 : Y, 25 : Z
//
//    public static void main(String[] args) {
//        String name = "JAN";
//        int totalMove = 0; // 전체 이동횟수
//        int nameLen = name.length();
//`
//        for (int i = 0; i < nameLen; i++) {
//
//            totalMove += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
//            System.out.println(totalMove);
//        }
//    }
//
//
//    //A 는 65, Z는 90
//    //첫 단어
//    //a -> z 가는데 A부터 가는게 빠른지 Z에서 원하는 알파벳으로 가는게 빠른지?
//    // 아스키코드로 계산 min((A -> Z), (Z - > A)) 가장 작은 값이 정답
//    // result += 위 계산값 저장
//
//    // 다음 연속된 A라는 문자를 만났을 떄는?
//    // 마지막이 아니라 그 다음 'A' 문자로 가야하는데
//    // 그 이동에 대한 계산은??
//    // 1. 첫번쨰로 돌아가서 마지막으로 간다
//    // 2. 오른쪽으로 계속 가는경우
//    // 계산 로직은.................
//
//
////    BAAAABAAB -> 첫 인덱스부터 끝까지 다 돌아야함(중간에 A 4개 커서 옮기는 횟수 추가)
////    BBAABAAAA -> BBAAB 까지만 가면 나머지는 어차피 A이기때문에 굳이 커서를 안옮기고 제출하면 최소경로
//
//}
