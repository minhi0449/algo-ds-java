package chap01;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : "); int a = stdIn.nextInt();
        System.out.print("b의 값 : "); int b = stdIn.nextInt();
        System.out.print("c의 값 : "); int c = stdIn.nextInt();

        // a, b, c 의 최댓값을 구하여 max 에 대입합니다.
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 '" + max + "' 입니다.");

        /*
            [실행 결과]
            세 정수의 최댓값을 구합니다.
            a의 값 : 1
            b의 값 : 3
            c의 값 : 2
            최댓값은 '3' 입니다.
         */


        /*
            if 문에서 생략된 것 : 중괄호 {}
            -----------------------------
            if (조건) {
                실행문;
            }
            -----------------------------
            if (조건) 실행문;
            -----------------------------
         */

        /*
            이게 알고리즘 맞아 ?
            --> 맞음. 최댓값을 구하는 명확한 절차
         */
    }
}
