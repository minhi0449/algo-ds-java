import java.util.Scanner;

// 실습 3-2
// 선형 검색(for문)
class SeqSearchFor {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 선형 검색
    static int seqSearch(int[] a, int n, int key){
        for (int i = 0; i < n; i++){ // 범위 체크 자동
            if (a[i] == key){        // 값 비교만
                return i;
            }
        }
        return -1;
    } // end of seqSearch

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = sc.nextInt();

        int idx = seqSearch(x, num, ky);

        if (idx == -1){
            System.out.println("검색 값의 요소가 없습니다.");
        } else {
            System.out.println("검색 값은 'x[" + idx + "]' 에 있습니다.");
        }

    }

} // end of class
