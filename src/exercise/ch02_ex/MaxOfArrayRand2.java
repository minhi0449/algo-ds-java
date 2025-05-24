package exercise.ch02_ex;

import java.util.Random;

// 연습 2-1
// Q1. 키뿐만 아니라 사람 수도 난수로 생성하도록 실습 2-4를 수정하여 프로그램을 작성하세요.
// 배열 요소의 최댓값을 출력합니다.(요솟수와 값을 난수로 생성)
class MaxOfArrayRand2 {

    // --- 배열 a의 최댓값을 구하여 반환 --- //
    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("키의 최댓값을 구합니다.");
        int num = 1 + rand.nextInt(20);
        int[] height = new int[num];

        System.out.println("사람 수는 → '" + num + "' 명 입니다.\n");
        System.out.println("[키는 다음과 같습니다.]");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "] : " + height[1]);
        }
        System.out.println("\n최댓값은 '" + maxOf(height) + "' 입니다.");
    }
}
