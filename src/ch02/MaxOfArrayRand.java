package ch02;

import java.util.Random;
import java.util.Scanner;

// 실습 2-4
// 배열 요소의 최댓값을 출력 (값을 난수로 생성)
class MaxOfArrayRand {

    // 배열 a의 최댓값을 구하여 반환
    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("\n키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("\n킷값은 아래와 같습니다.");
        for (int i = 0; i < num; i++){
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최댓값은 '" + maxOf(height) + "' 입니다.");

    }


}
