package ch01;

// 전체 프로그램 앞머리 (클래스 선언보다 앞)에 작성합니다.
import java.util.Scanner;
// java.util 패키지에 있는 Scanner 클래스를 프로그램에 포함시킵니다.

public class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // main 메서드의 앞쪽(키보드 값을 입력 받는 'stdIn.nextInt()' 보다 앞에 작성합니다.
        // System.in 은 키보드와 연결된 표준 입력 스트림(standard input stream)

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : "); int a = stdIn.nextInt();
        //                            --> 키보드로 입력한 값 중 정숫값을 읽어 들입니다.
        System.out.print("b의 값 : "); int b = stdIn.nextInt();
        System.out.print("c의 값 : "); int c = stdIn.nextInt();
        //                            --> 키보드로 입력한 값 중 정숫값을 읽어 들이는 부분
        //                            --> stdIn.nextInt() 를 호출하면 입력한 정숫값을 얻을 수 있음

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
