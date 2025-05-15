package _02_Loops;

import java.util.Scanner;

// 실습 1-8
// for 문으로 1, 2, ... , n의 합을 구함
// 1부터 n까지 정수의 합을 for문으로 구하는 프로그램
class SumFor {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println();
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0;        // 합

        for (int i = 1; i <= n; i++){
            sum += i;       // sum 에 i 를 더함
        }

        System.out.println("1부터 " + n + "까지의 합은 '" + sum + "' 입니다");

    }
}
