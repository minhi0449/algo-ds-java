import java.util.Scanner;

// 실습 3-3
// 선형 검색 (보초법, Sentinel)
class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key){
        int i = 0;

        a[n] = key; // 보초를 추가

        while (true) {
            // 검색 성공
            if (a[i] == key){ // 오직 값 비교만
                break;
            }
            i++;
        }
        return i == n ? -1 : i; // 마지막에 한 번만 위치 확인
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        // 보초 공간 1개 추가
        int[] x = new int[num + 1]; // 요솟수가 num + 1 인 배열

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : "); // 키 값을 입력받음
        int ky = sc.nextInt();

        int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 xy인 요소를 검색

        if (idx == -1){
            System.out.println("검색 값의 요소가 없습니다.");
        } else {
            System.out.println("검색 값은 'x[" + idx + "]' 에 있습니다.");
        }

    }
}
