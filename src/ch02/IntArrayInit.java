package ch02;

// 실습 2-2
// 구성 요소의 자료형이 int형인 배열 (구성 요솟수는 5: 배열 초기화에 의해 생성)
class IntArrayInit {
    public static void main(String[] args) {
        // a라는 이름의 숫자 상자(배열)에 1~5를 차례로 넣음
        // 메모리 상태 : [1, 2, 3, 4, 5]
        int[] a = {1, 2, 3, 4, 5}; // 배열 초기화에 의해 생성

        System.out.println();

        // 0부터 4번까지 반복해서
        for (int i = 0; i < a.length; i++){
            // a[i] 에 들어있는 값을 "a[번호] = 값" 형태로 출력
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
