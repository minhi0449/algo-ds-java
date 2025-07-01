import java.util.Scanner;

// 연습 3-5
// 이진 검색 (일치하는 맨 앞 요소를 찾습니다.)
public class BinSearchX {

    // --- 배열 a의 앞쪽 n개의 요소에서 key 와 일치하는 요소를 이진 검색 --- //
    static int binSearchX(int[] a, int n, int key){
        int pl = 0;     // 검색 범위 맨 앞의 인덱스
        int pr = n - 1; // 검색 범위 맨 끝의 인덱스

        do {
            int pc = (pl + pr) / 2;      // 중앙 요소의 인덱스
            if (a[pc] == key) {
                for (; pc > pl ; pc--) { // key 와 같은 맨 앞의 요소를 검색합니다.
                    if (a[pc - 1] < key){
                        break;
                    }
                }
                return pc;              // 검색 성공
            } else if(a[pc] < key) {
                pl = pc + 1;            // 검색 범위를 앞쪽 절반으로 좁힘
            } else {
                pr = pc - 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
            }
        } while (pl <= pr);

        return -1;                      // 검색 실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];         // 요솟수가 num 인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");  // 맨 앞 요소를 입력받음
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);  // 바로 앞의 요소보다 작으면 다시 입력 받음
        }

        System.out.print("검색 값 : "); // 키 값을 입력받음
        int ky = sc.nextInt();

        int idx = binSearchX(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1){
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
        }
    }

}
