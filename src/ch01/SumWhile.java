package ch01;

import java.util.Scanner;

// while 문으로 1,2, ... , n의 합을 구함
// 1부터 n까지 정수의 합을 구하는 알고리즘
class SumWhile {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println();
        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0;        // 합을 저장하는 변수 sum
        int i = 1;          // 반복을 제어하기 위한 변수 i

        while (i <= n){     // i가 n 이하면 반복함
            sum += i;       // sum에 i를 더함
            i++;            // i값을 1만큼 증가시킴
        }
        System.out.println("1부터 " + n + "까지의 합은 '" + sum + "' 입니다");

    }
}
