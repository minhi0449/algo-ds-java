package ch01;

// 실습 1-9-1
// 누적합 과정을 System.out.println()으로 출력하는 코드
class SumPrinter {
    public static void main(String[] args) {
        int n = 5; // 예: 1부터 5까지
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
    }
}
