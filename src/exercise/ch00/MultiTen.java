package exercise.ch00;

// 1부터 1000까지 수 중에 10의 배수만 출력
public class MultiTen {
    public static void main(String[] args) {

        System.out.print("1~1000 까지 10의 배수 : ");

        for (int i = 1; i <= 1000; i++){
            // 10의 배수
            if (i % 10 == 0){
                System.out.print(i + ",");
            }
        }

    }
}
