import java.util.Scanner;

class SumFor2Test {
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
            System.out.println("n값 : ");
            // 사용자가 입력한 정수를 n에 저장
            n = stdIn.nextInt();
        } while (n <= 0); // n이 0이하이면 다시 입력 요청

        // sum 변수를 0으로 초기화 : 1부터 n까지의 합을 저장할 공간
        int sum = 0;

        // for 루프 : 1부터 n까지 숫자를 하나씩 더함
        for (int i = 1; i <= n; i++)
            sum += i; // sum에 i를 더함

        // 결과 출력 : 1부터 n까지의 합을 사용자에게 보여줌
        System.out.println("1부터 '" + n + "' 까지의 합은 " + sum + "입니다.");

    }
}
