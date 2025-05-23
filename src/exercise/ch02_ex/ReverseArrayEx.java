package exercise.ch02_ex;

// 연습 2-2
// 배열 요소에 값을 입력 받아 역순으로 정렬합니다.(과정을 출력)
class ReverseArrayEx {

    // --- 배열 요소 a[idx1]과 a[idx2]를 교환 --- //
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }


}
