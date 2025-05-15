package _01_IntroAlgorithm;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 중앙값을 구하여 출력
class Median {

    // 세 수의 중앙값을 구하는 함수
    static int med3(int a, int b, int c){
        // a가 b보다 크거나 같을 때
        if (a >= b)
            // b가 c보다 크거나 같으면 b가 중앙값
            if (b >= c)
                return b;
            // a가 c보다 작거나 같으면 b가 중앙값
            else if (a <= c)
                return b;
            // 그 외의 경우 c가 중앙값
            else
                return c;
        // a가 b보다 작고, a가 c보다 크면 a가 중앙값
        else if (a > c)
            return  a;
        // a가 b보다 작고, b가 c보다 크면 c가 중앙값
        else if (b > c)
            return c;
        // 그 외의 경우 b가 중앙값
        else
            return b;

    } // end of med3

    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 Scanner 객체 생성
        Scanner stdIn = new Scanner(System.in);

        System.out.println();
        System.out.println("---- 세 정수의 중앙값을 구합니다. ----");

        // 사용자로부터 a, b, c 값을 입력 받음
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();

        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();

        // 중앙값 계산 후 출력
        System.out.println("중앙값은 '" + med3(a, b, c) + "' 입니다.") ;

    } // end of main
} // end of class

