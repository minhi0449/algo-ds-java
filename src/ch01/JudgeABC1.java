package ch01;

import java.util.Scanner;

class JudgeABC1 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        System.out.println();
        System.out.println("정수 입력하세요. : ");

        if (n == 1)
            System.out.println("A");
        else if (n == 2)
            System.out.println("B");
        else
            System.out.println("C");

    }
}
