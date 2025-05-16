package ch01;

// 실습 1-11
/*
    Verbose (버보스) : 상세한, 장황한, 세부 정보가 많은
    • 프로그래밍에서 "Verbose" 는 자세한 출력 / 로깅을 의미
    • 실행 과정에서 세부적인 정보를 출력한다는 의미

    실슴 1-11 에서는
    for 문을 반복을 n-1 번하고,
    if 문에 의한 판단은 없습니다.
    실행결과는 1-10 ㄱㅗㅏ ㄱㅏㅌㅇㅡㅁ

 */

import java.util.Scanner;

class SumVerbose2 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("n 값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        /// 중간과정 /////////////////////////////////////////
        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;   // sum에 i를 더함
        }
        /// ///////////////////////////////////////////////

        /// 마지막 과정 //////////////////////////////////////
        System.out.print(n + " = ");
        sum += n;       // sum에 n을 더함
        System.out.println(sum);
        /// ///////////////////////////////////////////////
    }
}
