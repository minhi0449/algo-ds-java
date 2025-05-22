package ch02;

import java.util.Scanner;

// 실습 2-3
// 배열 요소의 최댓값 출력(값을 입력받음)
class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;

    } // end of maxOf

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");

        System.out.print("사람 수 : ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("height[" + i + "] : ");
            height[i] = stdIn.nextInt();
        }

        System.out.println("최댓값은 '" + maxOf(height) + "' 입니다.");

    }
}
