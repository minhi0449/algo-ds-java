import java.util.Scanner;

// 실습 5-4
// 재귀에 대한 이해를 돕는 순수 재귀 메서드 (꼬리 재귀를 제거)
class RecurX1 {
    // 꼬리 재귀를 제거한 recur
    static void recur(int n){
        while (n > 0){
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        recur(x);
    }

}
