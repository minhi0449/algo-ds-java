package exercise.ch02_ex;

import java.util.Scanner;

// 연습 2-3
// Q3. 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
// 배열의 모든 요소의 합계값을 구합니다.
class SumOf {

    // --- 배열 a의 요솟값을 출력 --- //
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수는 : ");
        int num = sc.nextInt();

        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println("모든 요소의 합계는 '" + sumOf(a) + "' 입니다.");
    }
}
