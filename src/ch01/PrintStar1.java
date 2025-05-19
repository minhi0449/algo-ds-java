package ch01;

import java.util.Scanner;

// 실습 1-14
// *를 n개 출력하되 w개 마다 줄 바꿈(1)
// 반복 과정에서 조건 판단하기 3
class PrintStar1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;

        System.out.println();
        System.out.println("*를 n개 출력하되 w개 마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        do {
            System.out.print("w값 : ");
            w = stdIn.nextInt();
        } while (w <= 0 || w > n);

        // for 문에서 변수 i값을 w값으로 나눈 나머지가 w-1 일 때, 줄바꿈 진행
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i % w == w - 1){
                System.out.println(); // 줄 바꿈
            } // end of if
        }// end of for

        if (n % w != 0) {
            System.out.println();    // 줄 바꿈
        }

        /*
            사용자가 별(*)을 입력한 수 만큼 출력하되, 일정 개수마다 줄을 바꾸는 간단한 프로그램
            ---------------------------------------------------------------
            for 문 반복을 n번, if 문 판단을 n+1번 실행합니다.
            do-while : 적어도 한 번은 실행하고, 조건을 보고 또 할지 결정
            %(모듈로 → 나머지 연산) : 어떤 수를 나눴을 때, 남은 나머지를 구해줘

            [데이터 흐름 요약]
            1. 사용자에게 n과 w값을 물어본다
            2. n이 0보다 크고, w도 0보다 크고, n보다 작거나 같아야 한다.
            3. 별(*)을 n개 출력한다.
            4. 매 w개 마다 줄을 바꾼다.
            ---------------------------------------------------------------

            [데이터 흐름 개요]
            1. 프로그램 시작
            2. 사용자에게 n(별 몇 개 찍을까?)를 물어봄
            3. 사용자에게 w(몇 개 찍고 줄 바꿀까?)를 물어봐
            4. n개의 별을 찍되, w개 마다 줄을 바꿈
            5. 마지막 줄이 w개로 안 나눠졌다면 한 줄 더 바꿔줌

            ---------------------------------------------------------------

         */
    } // end of main
}// end of class
