import java.util.Scanner;

// 연습 3-2
// 선형 검색 (검색 과정을 자세히 출력)
public class SeqSearchEx {

    // --- 배열 a의 앞쪽 n개의 요소에서 key 와 일치하는 요소를 선형검색(보초법) --- //
    static int seqSearchEx(int[] a, int n, int key){
        System.out.println("   |");
        for (int k = 0; k < n; k++){
            System.out.printf("%4d", k); // 각 인덱스를 4칸 공간에 출력
        }
        System.out.println();

        System.out.print("---+");
        for (int k = 0; k < 4 * n +2; k++) {
            System.out.print("-");
        }
        System.out.println();

        // 선형 검색 실행 (각 단계별로 진행 상황 출력)
        for (int i = 0; i < n; i++){
            System.out.println("   |");

            // 현재 검사 중인 위치에 별표(*) 표시
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", a[k]);
            }
            System.out.println("\n   |");
            if (a[i] == key) {
                return i; // 검색 성공
            }
        }
            return -1; // 검색 실패 (모든 요소를 다 검사한 후 검색 실패 반환)
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색 할 값: ");
        int ky = sc.nextInt();

        int idx = seqSearchEx(x,num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 'x[" + idx + "]' 에 있습니다.");
        }

    }

}
