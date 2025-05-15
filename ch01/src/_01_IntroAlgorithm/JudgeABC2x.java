package _01_IntroAlgorithm;

import java.util.Scanner;

// 실습 1-6
// 아무 작업하지 않는 else 가 숨어 있어
// 프로그램의 흐름이 4개로 분기
class JudgeABC2x {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println();
        System.out.print("정수 입력하세요. : ");
        int n = stdIn.nextInt();

        if (n == 1)
            System.out.println("A");
        else if (n == 2)
            System.out.println("B");
        else if (n == 3)
            System.out.println("C");
        else
            ; // ';'만 있는 빈 문장은 아무것도 하지 않습니다.
    }
}
