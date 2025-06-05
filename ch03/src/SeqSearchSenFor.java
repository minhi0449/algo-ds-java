import java.util.Scanner;

// 연습 3-1
// 선형 검색 (보초법 : for 문을 사용하여 구현)
// 실습 3-3 SeqSearchSen 메서드를 while 문 대신 for 문을 사용하여 수정한 프로그램 작성

// 보초법은 찾는 값이 없을 때 안전하고 빠르게 반복문을 종료하기 위한 방법
// 보초법 = “찾는 값이 없을 경우에도 반복문이 무조건 종료되게 만드는 기법”
// 별도로 종료 조건(i < n)을 체크하지 않아도 되게 만드는 똑똑한 방법
class SeqSearchSenFor {
    // --- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 선형 검색(보초법) --- //

    /**
     * 검색 메서드 선언부
     * @param a     : 검색할 배열
     * @param n     : 실제 검색할 요소의 개수
     * @param key   : 찾고자 하는 값
     * @return
     */
    static int seqSearchSen(int[] a, int n, int key){
        int i;

        a[n] = key; // 보초를 추가

        System.out.println("\n✔️ 보초 추가 : a[" + n + "] = '" + a[n] + "' ← 보초자리");

        for (i = 0; a[i] != key; i++){
            System.out.println("🔍 a[" + i + "] = " + a[i] + " 과(와) key = '" + key + "' 비교 중...");

            ; // 빈 문장 - 조건을 만족할 때까지 i만 증가
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        // 배열 생성 : 크기를 num + 1로 하여 보초를 위한 공간 확보
        int[] x = new int[num + 1]; // 요솟수가 num + 1 인 배열

        // 배열에 실제 데이터 입력받기 (0번째부터 num-1 번째 까지)
        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt(); // 사용자가 입력한 정수를 배열에 저장
        }

        // 검색할 값 입력받기
        System.out.print("검색할 값 : "); // 키값을 입력받음
        int ky = sc.nextInt();          // 찾고자 하는 값

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 'x[" + idx + "]' 에 있습니다.");
        }

        /*
            보초법 (Sentinel Method)
            -> 맨 마지막에 찾을 값을 미리 넣어두는 방법

            [데이터 흐름]
            1) 입력 숫자 수
            2) 배열에 저장
            3) 검색할 숫자 입력
            4) 배열 하나씩 비교
            5) 결과 출력

         */

    }
}
