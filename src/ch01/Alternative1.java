package ch01;

import java.util.Scanner;

// 실습 1-12
// + 와 - 번갈아 출력 (1)
// Alternative (올터너티브): 대안, 다른 방법
// "대체 코드, 대안 알고리즘"
class Alternative1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("+ 와 - 를 번갈아 n개 출력합니다.");

        do {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n; i++) // for 문 반복을 n번, 나눗셈을 n번, if 문 판단을 n번 실행
            if (i % 2 == 0) // 짝수 : i가 짝수(2로 나눈 나머지가 0)이면 +를 출력
                System.out.print("+ ");
            else            // 홀수 : i가 홀수이면 -를 출력
                System.out.print("- ");

        System.out.println();
        stdIn.close();

        /*
            [프로그램 2가지 문제점]
            ① 반복할 때마다 if문 실행해야 함
            - 다시 말해 for 문을 반복할 때 마다 if 문을 실행
            - 따라서 i 값이 홀수인지 알아내기 위해 if 문을 모두 n번 실행해야 함
            - 예를 들어 n값이 50,000 이면 if 문도 50,000번 실행

            ② 변경할 때, 유연하게 대응하기 어려움
            - 이 프로그램의 카운터용 변수인 i값은 0부터 n-1 까지 1씩 중가함
            - 만약 i값을 0부터 시작하지 않고, 1부터 n까지 증가시키려면 '실습 1-13' 처럼 수정
         */

    }
}
