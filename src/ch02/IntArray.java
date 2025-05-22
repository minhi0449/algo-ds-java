package ch02;

// 실습 2-1
// 구성 요소의 자료형이 int 형인 배열(구성 요솟수는 5: new 에 의해 본체를 생성)
class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5]; // 배열의 선언

        a[1] = 37;          // a[1]에 37을 대입
        a[2] = 51;          // a[2]에 51을 대입
        a[4] = a[1] * 2;    // a[4]에 a[1] * 2 , 곧 74를 대입

        System.out.println();
        for (int i = 0; i <a.length; i++){ // 각 요솟값을 출력
            System.out.println("a[" + i + "] = " + a[i]);
        }

        /*
            a[0] = 0
            a[3] = 0

            이 프로그램의 실행 결과를 보면
            값을 대입하지 않은 a[0]과 a[3]의 값이 0인 것을 알 수 있음

            ✓ 배열의 구성 요소는 자동으로 0으로 초기화되는 규칙이 있음
            ✓ 배열을 생성할 때, 각 구성 요소에 넣는 초깃값을 기본값(Default Value)라고 함
            --> 기본값은 '일부러 값을 설정하지 않아도 기본으로 값이 설정된다' (= 디폴트값)

            [자료형별 기본값]
            - int, byte, short, long: 0
            - float, double: 0.0
            - boolean: false
            - char: '\u0000' (널 문자)
            - 참조형(객체): null
         */
    }
}