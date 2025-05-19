package doWhile;

import java.util.Scanner;

// 숫자 맞추기 게임
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 7; // 비밀숫자
        int userGuess;

        System.out.println("1부터 10까지의 숫자를 맞춰보세요.");

        do {
            System.out.print("> 숫자를 입력하세요 : ");
            userGuess = sc.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("* 더 큰 숫자를 입력하세요.");
            } else if (userGuess > secretNumber) {
                System.out.println("* 더 작은 숫자를 입력하세요.");
            }

        } while (userGuess != secretNumber);
        // 사용자가 정답을 맞출 때까지 (userGuess != secretNumber) 를 계속 반복

        System.out.println("정답입니다 ! 숫자 '" + secretNumber + "' 를 맞추셨습니다!");
        sc.close();
    }
}
