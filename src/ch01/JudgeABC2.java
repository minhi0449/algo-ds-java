package ch01;

import java.util.Scanner;

// 실습 1-5
// 프로그램 흐름 3개로 분기하는 것 처럼 보이지만,
// n값이 1,2,3 이외의 값이면 아무것도 출력 x
// --> 그래서 실습 1-6 의 모습으로 나타냄
class JudgeABC2 {
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

    }
}
