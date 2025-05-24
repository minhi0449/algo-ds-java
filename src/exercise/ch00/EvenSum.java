package exercise.ch00;

// 1부터 1000까지 더할 때, 짝수만 더해서 결과 출력
public class EvenSum {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
                //  sum + i = sum
            }
        }

        System.out.println("1 ~ 1000까지 짝수의 합 : " + sum);

    }
}
