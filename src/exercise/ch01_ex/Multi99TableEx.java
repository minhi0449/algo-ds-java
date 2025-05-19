package exercise.ch01_ex;

// 연습 1-11
// 구구단 표를 출력 (곱하는 수를 출력)
// Q11. 위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하세요.
// (구분선은 수직선(|), 마이너스(-), 플러스(+) 기호를 사용하세요.)
class Multi99TableEx {
    public static void main(String[] args) {

        System.out.print("   |");
        for (int i = 1; i <= 9; i++){
            System.out.printf("%3d", i);
        }
        System.out.println("\n---+----------------------------");

        for (int i = 1; i <= 9; i++){
            System.out.printf("%2d |", i);
            for (int j = 1; j <= 9; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
