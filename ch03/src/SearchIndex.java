import java.util.Scanner;

// 연습 3-3
// 특정 값을 갖는 배열 안의 모든 요소를 다른 배열에 copy
/*
    요솟수가 n인 배열 a에서 key 와 일치하는 모든 요소의 인덱스를
    배열 idx 의 맨 앞부터 순서대로 저장하고, 일치하는 요솟수를 반환하는 메서드를 작성하세요.
    예를 들어, 요솟수가 8인 배열 a의 요소가 {1,9,2,9,4,6,7,9} 이고, key 가 9일 때
    배열 idx에 {1,3,7}을 저장하고 3을 반환합니다.
    static int searchIdx(int[] a, int n, int key, int[] idx)
 */
public class SearchIndex {

    // --- 배열 a의 앞쪽 n개의 요소에서 key 와 일치하는 모든 요소의 인덱스를 --- //
    // --- 배열 idx 의 앞쪽부터 순서대로 저장하고 일치하는 요솟수를 반환합니다. --- //
    static int searchIdx(int[] a, int n, int key, int[] idx){
        int count = 0; // key 와 일치하는 요솟수
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[count++] = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num]; // x는 우리가 입력한 모든 숫자 저장
        int[] y = new int[num]; // y는 key 랑 같은 숫자가 있는 '위치'를 저장할 공간

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int count = searchIdx(x, num, ky, y); // 배열 x 안의 값이 ky인 요소를 y에 copy

        if (count == 0) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("그 값은 'x[" + y[i] + "]' 에 있습니다." );
            }
        }

    }
}
