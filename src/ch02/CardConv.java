package ch02;

import java.util.Scanner;

// 실습 2-6: 입력받은 10진수를 2진수 ~ 36진수로 변환하여 출력
class CardConv {
    // 정수 x를 r 진수로 변환하여 배열 d 에 저장하고, 자릿수를 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0; // 변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPRSTUVWXYZ"; // 숫자→문자 매핑용 문자열

        do {
            d[digits++] = dchar.charAt(x % r); // 나머지를 문자로 변환하여 저장
            x /= r; // 몫을 다음 연산 대상으로 설정
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no; // 변환 대상 숫자
        int cd; // 변환할 진수
        int dno; // 변환된 자릿수
        int retry; // 다시 할지 여부
        char[] cno = new char[36]; // 결과 저장 배열

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36): ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno);

            System.out.print(cd + "진수로는: ");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println(" 입니다.");

            System.out.print("한 번 더 할까요? (1_예 / 2_아니요): ");
            retry = sc.nextInt();

        } while (retry == 1); // ← 이 부분의 닫는 중괄호가 main 함수 안에 있어야 함
    }
}