package ch01;

import java.util.Scanner;

// 실습 1C-2
// 논리 연산과 드모르간 법칙
// 2자리의 양수(10-99)를 입력
class TwoDigits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력하세요");

        do {
            System.out.print("no값 : ");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("변수의 no값은 '" + no + "' 이 되었습니다.");
    }
}
