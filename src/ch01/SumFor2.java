package ch01;

import java.util.Scanner;

// 실습 1-9
// 양수만 입력하여 1, 2, ... ,n의 합을 구함
class SumFor2 {
    public static void main(String[] args) {
        // Scanner 객체 생성 : 사용자로부터 키보드 입력을 받기 위한 도구 준비
        Scanner stdIn = new Scanner(System.in);

        // n 변수 선언 : 사용자가 입력할 숫자를 저장할 공간
        int n;

        // 안내 메시지 출력 : 사용자에게 프로그램의 목적을 알림
        System.out.println();
        System.out.println("1부터 n 까지의 합을 구합니다.");

        // 양수 확인 (do-while 루프) : 사용자가 양수를 입력할 때까지 반복
        do {
            // 입력 요청 메시지 출력
            System.out.print("n값 : ");
            // 사용자가 입력한 정수를 n에 저장
            n = stdIn.nextInt();
        } while (n <= 0); // n이 0이하이면 다시 입력 요청

        // sum 변수를 0으로 초기화 : 1부터 n까지의 합을 저장할 공간
        int sum = 0;

        // for 루프 : 1부터 n까지 숫자를 하나씩 더함
        // i라는 숫자를 1부터 시작해서, n보다 작거나 같을 때까지
        // 하나씩(1 → 2 → 3 → … n) 더하면서 계속 반복
        for (int i = 1; i <= n; i++)
            sum += i; // sum에 i를 더해서 다시 sum에 저장
            // sum += i : 매 반복마다 i의 값이 sum 으로 이동해서 차곡차곡 더해져

        // 결과 출력 : 1부터 n까지의 합을 사용자에게 보여줌
        System.out.println("1부터 '" + n + "' 까지의 합은 '" + sum + "' 입니다.");

    }
}
