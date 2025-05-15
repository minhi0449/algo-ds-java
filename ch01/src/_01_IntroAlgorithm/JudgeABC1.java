package _01_IntroAlgorithm;

import java.util.Scanner;

// 실습 1-4
// n값이 1이나 2가 아닌 어떤 값이라도 C를 출력
// 프로그램의 흐름이 3개로 분기
class JudgeABC1 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println();
        System.out.print("정수 입력하세요. : "); // 사용자에게 입력 요청
        int n = stdIn.nextInt(); // 입력한 숫자 n에 저장

        // 순서
        // 1. 사용자에게 먼저 "입력" 요청
        // 2. 그 다음 숫자 입력을 받아야 함

        if (n == 1)
            System.out.println("A");
        else if (n == 2)
            System.out.println("B");
        else
            System.out.println("C");

    }
}
