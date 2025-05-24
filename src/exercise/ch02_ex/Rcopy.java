package exercise.ch02_ex;

import java.util.Scanner;

// 연습 2-5
// 배열의 모든 요소를 역순으로 'copy' 합니다.
class Rcopy {

    // --- 배열 b의 모든 요소를 배열 a에 역순으로 copy --- //
    static void rcopy(int[] a, int[] b){
        int num = a.length <= b.length ? a.length : b.length;
        for (int i = 0; i < num; i++) {
            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a의 요솟수는 : ");
        int numa = sc.nextInt();
        int[] a = new int[numa];
        for (int i = 0; i < numa; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("b의 요솟수는 : ");
        int numb = sc.nextInt();
        int[] b = new int[numb];
        for (int i = 0; i < numb; i++){
            System.out.print("b[" + i + "] : ");
            b[i] = sc.nextInt();
        }

        rcopy(a, b);

        System.out.println();
        System.out.println("배열 b의 모든 요소를 배열 a에 역순으로 copy 하였습니디.");
        for (int i = 0; i < numa; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
