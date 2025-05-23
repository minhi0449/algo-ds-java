package ch02;

import java.util.Scanner;

// 실습 2-3 (코드 리뷰 ver)
// 배열에서 최댓값을 찾는 프로그램
class MaxOfArray_ {

    // maxOf 메서드 : 정수 배열을 받아서 그 중 최댓값을 반환하는 메서드
    // static : 객체를 생성하지 않고도 바로 사용할 수 있는 메서드
    // int : 반환값의 데이터 타입 (정수)
    // int[] a : 매개변수 - 정수 배열을 받음
    static int maxOf(int[] a) {

        // 최댓값을 저장할 변수 max를 배열의 첫 번째 요소로 초기화
        // 비교의 기준점을 설정하는 과정
        int max = a[0];

        // for 반복문 : 배열의 두 번째 요소부터 마지막까지 순차적으로 확인
        // i = 1 : 인덱스 1번(두 번째 요소)부터 시작
        // i < a.length : 배열의 길이보다 작을 때까지 반복
        // i++ : 반복할 때마다 i를 1씩 증가
        for (int i = 1; i < a.length; i++){

            // 조건문 : 현재 확인 하는 요소가 지금까지의 최댓값보다 큰지 확인
            if (a[i] > max){
                // 더 큰 값을 발견하면 max 변수를 업데이트
                max = a[i];
            }
        }
        // 찾은 최댓값을 메서드를 호출한 곳으로 반환
        return max;

    } // end of maxOf

    // main 메서드 : 프로그램의 시작점
    // public : 외부에서 접근 가능
    // static : 객체 생성 없이 실행 가능
    // void : 반환값이 없음
    // String[] args : 명령행 인수를 받는 배열
    public static void main(String[] args) {

        // Scanner 객체 생성 : 키보드 입력을 받기 위한 도구
        // System.in : 표준 입력(키보드)을 의미
        Scanner stdIn = new Scanner(System.in);

        // 프로그램 시작 메시지 출력
        System.out.println("키의 최댓값을 구합니다.");

        // 사용자에게 '사람 수' 입력 요청
        System.out.print("사람 수 : ");

        // 사용자가 입력한 정수를 num 변수에 저장
        int num = stdIn.nextInt();

        // 입력받은 '사람 수' 만큼의 크기를 가진 정수 배열 생성
        // new int[num] : num 크기의 새로운 정수 배열을 메모리에 할당
        int[] height = new int[num];

        // for 반복문 : 각 사람의 키를 입력받아 배열에 저장
        // i = 0 : 첫 번째 사람부터 시작
        // i < num : 입력 받은 사람 수 만큼 반복
        for (int i = 0; i < num; i++){

            // 몇 번째 사람의 키를 입력하는지 안내 메시지 출력
            // 문자열 연결 : "height[" + i + "] : " 형태로 출력
            System.out.print("height[" + i + "] : ");

            // 사용자가 입력한 키 값을 배열의 i번째 위치에 저장
            height[i] = stdIn.nextInt();
        }

        // 최종 결과 출력
        // maxOf(height) : height 배열을 maxOf 메서드에 전달하고 최댓값을 받아옴
        // 문자열 연결을 통해 결과를 포맷팅하여 출력
        System.out.println("최댓값은 '" + maxOf(height) + "' 입니다.");

    }
}
