package ch01;

import java.util.Scanner;

// 실습 1-13
// + 와 - 번갈아 출력 (2)
class Alternative2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++){
            System.out.print("+-");
        }

        if (n % 2 != 0){
            System.out.print("+");
        }

    } // end of main
} // end of class
