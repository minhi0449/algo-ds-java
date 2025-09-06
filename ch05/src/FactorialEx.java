import java.util.Scanner;

// 연습 5-1
// 실습 5-1의 factorial 메서드를 재귀 메서드 호출을 사용하지 말고 작성
// 팩토리얼 값을 비재귀적으로 구하기
class FactorialEx {
    // 음이 아닌 정숫값 n의 팩토리얼 값을 반환
    static int factorial(int n){
        int fact = 1;

        while (n > 1){
            fact *= n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        System.out.println(x + " 의 팩토리얼은 " + factorial(x) + " 입니다.");
    }

}
