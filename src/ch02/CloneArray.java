package ch02;

import java.util.Arrays;

// 실습 2C-1
// 배열을 복제
class CloneArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); // b 는 a 의 복제를 참조

        b[3] = 0;            // 한 요소에만 0을 대입

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));
    }
}
