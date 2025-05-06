package exercise.chap01;

import java.util.Scanner;

public class Max4 {

    public static void main(String[] args) {

        // Q1.
        // 네 값의 최댓값을 구하는 max4 메서드를 작성
        Scanner sc = new Scanner(System.in);

        /*
        [1]
        int a = sc.nextInt(); -->  입력만 받고 바로 출력하는데,
        System.out.print("a : " + a);
        --> 안내문구 "a : " 가 사용자 입력 전에 출력되지 않아서 사용자 혼란 유발

        [2]
        System.out.print("b : " + sc.nextInt());
        --> sc.nextInt() 가 먼저 실행되면서 입력을 기다림
        --> 입력값은 출력되지만 변수 b에 저장되지 않음

        int b = sc.nextInt();
        --> 다시 입력을 받아야 b에 저장되므로 총 2번 입력하게 됨

        [3]
        System.out.print("c : " + sc.nextInt());
        --> 출력 전에 입력 대기 → 안내 부족

        int c = sc.nextInt();
        --> c도 2번 입력해야 저장됨 (비효율적)

        [4]
        System.out.print("d : " + sc.nextInt());
        int d = sc.nextInt();

        */

        System.out.print("a : ");
        int a = sc.nextInt();

        System.out.print("b : ");
        int b = sc.nextInt();

        System.out.print("c : ");
        int c = sc.nextInt();

        System.out.print("d : ");
        int d = sc.nextInt();


        // [5] 네 값 중 최댓값 구하기
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("최댓값 : '" + max + "'"); // 줄바꿈만 하고 아무것도 출력 안 됨
        // 최댓값 출력이 없음 --> 결과가 안 보임


    }

}
