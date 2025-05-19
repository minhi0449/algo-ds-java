package exercise.ch01_ex;

// 연습 1-12
// 구구단 덧셈표 출력
// Q12. 구구단 곱셈표를 변형하여 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하세요.
// (Q11과 같이 표의 위쪽과 왼쪽에 더하는 수를 출력하세요.)
class Add99TableEx {
    public static void main(String[] args) {

        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+----------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }


    }
}
