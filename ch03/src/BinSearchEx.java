import java.util.Scanner;

// 연습 3-4
// 이진 검색 (검색 과정을 자세히 출력)
public class BinSearchEx {
    // --- 배열 a의 앞쪽 n개의 요소에서 key 와 일치하는 요소를 이진 검색(검색 과정을 자세히 출력) --- //
    static int binSearchEx(int[] a, int n, int key){
        System.out.println("   |");
        for (int k = 0; k < n; k++) {
            System.out.printf("%4d", k);
        }
        System.out.println();

        System.out.println("---+");
        for (int k = 0; k < 4 * n + 2; k++) {
            System.out.print("-");
        }
        System.out.println();

        int pl = 0;                 // 검색 범위 맨 앞의 인덱스
        int pr = n - 1;             // 검색 범위 맨 뒤의 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            System.out.print("   |");
            if (pl != pc) {
                System.out.printf(String.format("%%%ds<-%%%ds+",
                        (pl * 4) + 1, (pc - pl) * 4),
                        "", "");
            } else {
                System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
            }

            if (pc != pr){
                System.out.printf(String.format("%%%ds->\n",
                        (pr - pc) * 4 - 2), "");
            } else {
                System.out.println("->");
            }
            System.out.printf("%3d|", pc);

            for (int k = 0; k < n; k++) {
                System.out.printf("%4d", a[k]);
            }
            System.out.println("\n   |");

            if (a[pc] == key){
                return pc;              // 검색 성공
            } else if (a[pc] < key) {
                pl = pc + 1;            // 검색 범위를 뒤쪽 절반으로 좁힘
            } else {
                pr = pc - 1;            // 검색 범위를 앞쪽 절반으로 좁힘
            }
        } while (pl <= pr);
        return -1;                      // 검색 성공

    } // end of binSearchEx

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num  = sc.nextInt();
        int[] x = new int[num];         // 요솟수가 num 인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();            // 맨 앞 요소를 입력받음

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);  // 바로 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색 값 : "); // 키 값을 입력받음
        int ky = sc.nextInt();

        int idx = binSearchEx(x, num, ky); // 배열 x에서 값이 ky 인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
        }

    }
}
