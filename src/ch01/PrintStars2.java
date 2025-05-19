package ch01;

import java.util.Scanner;

// 실습 1-15
// *를 n개 출력하되 w개 마다 줄 바꿈(2)
// 반복 과정에서 조건 판단하기 3
class PrintStars2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, w;

        System.out.println("\n*를 n개 출력하되, w개 마다 줄을 바꿔서 출력합니다.");

        do {
            System.out.print("n값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        do {
            System.out.println("w값 : ");
            w = sc.nextInt();
        } while (w <= 0 || w > n);

        for (int i = 0; i < n / w; i++){
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0){
            System.out.println("*".repeat(rest));
        }


    }
}
