package exercise.chap01;

import java.util.Scanner;

public class Max4Util {
    /**
     * 4개의 정수 값 중에서 최댓값을 반환합니다.
     *
     * @param a 첫 번째 정수
     * @param b 두 번째 정수
     * @param c 세 번째 정수
     * @param d 네 번째 정수
     * @return 네 정수 중 최댓값
     */
    public static int max4(int a, int b, int c, int d){
        int max = a; // 첫 번째 값을 최댓값으로 초기화

        // 나머지 값들과 비교하여 더 큰 값이 있으면 최댓값 업데이트
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max; // 최종 최댓값 반환
    }


    public static void main(String[] args) {
        // Scanner 객체 생성 (try-with-resources 사용 - 자동으로 리소스 해제)
        try (Scanner sc = new Scanner(System.in);){
            // 4개의 정수를 저장할 배열 생성
            int[] nums = new int[4];

            // 입력 라벨로 사용할 문자 변수 초기화
            char label = 'a';

            System.out.println();
            System.out.println("4개의 정수를 입력하세요.");

            // 사용자로부터 4개의 정수 입력받기
            for (int i = 0; i < 4; i++){
                System.out.print(label + " : ");
                nums[i] = sc.nextInt();
                label++;
            }

            // 최댓값 계산 (배열의 요소를 Max4Util.max4 메서드에 전달
            int maxValue = Max4Util.max4(nums[0], nums[1], nums[2], nums[3]);

            // 최댓값 출력
            System.out.println("max : " + maxValue);

        } catch (Exception e){
            System.out.println("입력 처리 중 오류가 발생했습니다. : " + e.getMessage());
        }




    }

}
