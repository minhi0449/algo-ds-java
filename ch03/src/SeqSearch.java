import java.util.Scanner;

// 실습 3-1
// 선형 검색 (Linear Search)
// 배열 a의 처음부터 끝까지 n개인 요소를 대상으로
// key 인 요소를 선형으로 검색하고 검색한 요소의 인덱스 반환
class SeqSearch {
    // 요솟수가 n인 배열 a에서 key 와 값이 같은 요소를 선형 검색
    // 선형 검색 메서드 : 배열에서 특정 값을 찾아 인덱스를 반환

    /**
     * 선형 검색 메서드
     * @param a    // 검색할 배열
     * @param n    // 배열의 크기 (요소 개수)
     * @param key  // 찾고자 하는 값
     * @return     // 찾으면 인덱스, 못 찾으면 -1 반환
     */
    static int seqSearch(int[] a, int n, int key){
        int i = 0;  // 배열의 인덱스를 나타내는 변수, 0부터 시작

        while (true){ // 무한 반복문 시작
            // 배열의 끝에 도달했는지 확인
            if (i == n){ // 인덱스 i가 배열의 크기 n과 같아지면, 배열 끝까지 확인한 것
                return -1;  // 검색 실패 (-1을 반환)
            }

            // 현재 위치의 값이 찾는 값과 같은지 확인
            if (a[i] == key){
                return i;   // 검색 성공 (인덱스를 반환)
            }

            i++; // 다음 위치로 이동 (인덱스 증가)
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 크기 입력받기
        System.out.print("요솟수 : ");
        int num = sc.nextInt(); // 정수 입력 받아 num 변수에 저장

        // num 크기의 정수 배열 생성
        int[] x = new int[num]; // 요솟수가 num 인 배열

        // 배열의 각 요소에 값 입력받기
        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt(); // 각 배열 요소에 값 저장
        }

        // 검색할 값 입력받기
        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();  // 키 값을 입력 받음

        // 선형 검색 실행
        int idx = seqSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1){ // 검색 실패한 경우
            System.out.println("그 값의 요소가 없습니다.");
        } else { // 검색 성공한 경우
            System.out.println("그 값은 'x[" + idx + "]' 에 있습니다.");
        }

        sc.close();

        /*
            ✓ 'i == n' 은 배열의 끝을 의미
            - java 배열의 인덱스는 0부터 'n-1' 까지 이므로, i == n 은 배열을 벗어난 상태

            ✓ 검색 실패를 나타내기 위해 -1을 반환하고 메서드 종료
            - 반환 값으로 -1을 사용하는 건 검색 실패를 나타내는 관례.
            - 다른 값(예: null)은 적절하지 않음
            - 왜 null 은 안 될까?
            - null 은 마치 '아,, 나 아무 생각도 안 나!' 라고 말하는 것과 비슷
            - 인덱스 어디있어? 라고 물었을 때, 모르겠어요! 라고 대답하면 혼란스러움
            - 배열을 확인 안 한 건지, 아니면 다른 문제가 있는지 알 수가 없음
            - 하지만 -1은 명확하게 없다는 뜻이라서 바로 이해 가능
         */
    }
}

