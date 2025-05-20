package exercise.ch01_ex;

import java.util.Scanner;

// 연습 1-15
// 특수문자 *으로 피라미드 출력
class StarPira {

    // --- 특수문자 * 을 나열하여 피라미드를 출력 --- //
    static void spira(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i-1)*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("피라미드를 출력합니다.");

        do {
            System.out.print("단수는 : ");
            n = sc.nextInt();
        } while (n <= 0);

        spira(n); 
        sc.close();
    }
}
