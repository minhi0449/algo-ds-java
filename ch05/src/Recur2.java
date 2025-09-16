// 연습 5-4
// 재귀에 대한 이해를 높이기 위한 재귀 메서드 recur2 분석
// 다음의 recur2 메서드에 대하여 하향식 분석과 상향식 분석을 수행하세요.

/*
    하향식(Top Down) 분석은 생략합니다.

    상향식(Bottom Up) 분석을 수행하면 아래처럼 됩니다.
    recur2(-1) (아무것도 출력하지 않음)
    recur2(0) (아무것도 출력하지 않음)
    recur2(1) recur2(-1) 1  recur2(0)  1
    recur2(2) recur2(0)  2  recur2(1)  21
    recur2(3) recur2(1)  3  recur2(2)  1321
    recur2(4) recur2(2)  4  recur2(3)  2141321
 */

import java.util.Scanner;

class Recur2 {
    // 재귀 메서드
    static void recur(int n){
        if(n > 0){
            recur(n - 2);
            System.out.println(n);
            recur(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        recur(x);
    }
}
