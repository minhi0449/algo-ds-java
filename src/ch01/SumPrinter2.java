package ch01;

import java.util.Scanner;

// 실습 1-9-2
// 누적합 과정 / Scanner로 사용자 입력 받기
class SumPrinter2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print(" 1 ~ n 까지 / 더할 숫자 n값 입력 : ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }

        System.out.println("최종 누적합 (sum) = " + sum);
        sc.close(); // 입력 도구 닫기 (메모리 누수 방지)
    }
}
