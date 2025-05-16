package ch01;

import java.util.Scanner;

// 실습 1-10
// 1, 2, ···, n의 합과 그 값을 구하는 과정 출력(1)
class SumVerbose1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 1; i <= n; i++){
            if (i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");
            sum += i;
        }

        System.out.println(sum);

    }
}
