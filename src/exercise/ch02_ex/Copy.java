package exercise.ch02_ex;

import java.util.Scanner;

// 연습 2-4
// Q4. 배열 b의 모든 요소를 배열 a에 복사하는 메서드 'copy' 를 작성하세요.
// 배열의 모든 요소를 copy 합니다.
class Copy {

    // --- 배열 b의 모든 요소를 배열 a에 copy --- //
    static void copy(int[] a, int[] b) {
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++){
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\na의 요솟수는 : ");

        int numa = sc.nextInt();    // 요솟수
        int[] a = new int[numa];    // 요솟수가 numa 인 배열

        for (int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nb의 요솟수 : ");

        int numb = sc.nextInt();
        int[] b = new int[numb];

        for (int i = 0; i < numb; i++) {
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        copy(a, b); // 배열 b의 모든 요소를 배열 a에 copy

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
        for (int i = 0; i < numa; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("---------------------------------------");
    }
}
