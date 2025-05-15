package _01_IntroAlgorithm;

import java.util.Scanner;

// 입력한 정숫값의 부호(양수/음수/0)를 판단하는 클래스
class JudgeSign {
    public static void main(String[] args) {
        // Scanner : 사용자 입력을 처리하는 가장 기본적인 클래스
        Scanner stdIn = new Scanner(System.in);

        System.out.println();
        System.out.print("정수를 입력하세요. : ");

        // 사용자로부터 입력받은 정수를 '변수 n'에 저장
        int n = stdIn.nextInt(); // 다른 입력 메서드 : nextLine() 문자열 / nextDouble() 실수
        // int : 정수형 데이터 (소수점 없는 숫자)

        // n의 부호를 판단해 적절한 메시지 출력
        if(n > 0) // n이 0보타 크면
            System.out.println("이 수는 양수 입니다.");
        else  if (n < 0) // n이 0보다 작으면
            System.out.println("이 수는 음수 입니다.");
        else // 위 조건이 모두 아니면 (n이 0이면)
            System.out.println("이 수는 0 입니다.");

        stdIn.close();

    } // end of main
} // end of class

