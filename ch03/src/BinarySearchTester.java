import java.util.Arrays; // 배열 관련 유틸리티 메서드 제공 클래스
import java.util.Scanner; // 사용자 입력을 받기 위한 클래스

// 실습 3-5
// Arrays.binarySearch 로 이진 검색
public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num]; // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : "); // 배열의 첫 요소를 먼저 입력 받음
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력 받음
        }

        System.out.print("검색할 값 :"); // 키 값을 입력 받음
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
        }
    }
}
