package exercise.doWhile;

import java.util.Scanner;
/*
    [do-while 문]
    do{
        // 실행할 코드 블록
    } while (조건식);
    ------------------------------------------------------------------
    [동작 순서]
    1. do 다음의 코드 블록을 무조건 한 번 실행
    2. while의 조건식 평가
    3. 조건이 참(true) 이면 다시 do의 코드 블록으로 돌아가 실행합니다.
    4. 조건이 거짓(false)이면 반복을 종료합니다.
    ------------------------------------------------------------------
    [while 문과 차이점]
    - while 문 : 조건을 먼저 검사하고, 조건이 참일 때만 코드 블록 실행

    while (조건식){
        // 실행할 코드 블록
    }
   ------------------------------------------------------------------
   [핵심 차이점]
   do-while 문은 조건이 처음부터 거짓이어도
   코드 블록이 최소 1번은 반드시 실행
   ------------------------------------------------------------------

 */
public class DoWhileBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("10보다 큰 수를 입력하세요 : ");
            n = sc.nextInt();
        } while (n <= 10);

        System.out.println("입력한 수는 '" + n + "' 입니다.");
        sc.close();
    }
}
