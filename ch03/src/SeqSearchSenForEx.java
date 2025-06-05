
// 연습 3-1-1
public class SeqSearchSenForEx {

    // 검색 메서드 정의 : 배열 a에서 key 값 찾기
    static int seqSearch(int[] a, int key){
       for (int i = 0; i < a.length; i++){
           System.out.println("🔍 a[" + i + "] = " + a[i] + " 과 key = " + key + " 비교 중...");
           if (a[i] == key) {
               System.out.println("✅ 찾은 배열 위치 : a[" + i + "]");
               return i; // 찾음
           }
       }
        System.out.println("❌ 끝까지 비교 하였으나 찾지 못했습니다.");
       return -1; // 못 찾음
    }

    // 프로그램 시작 지점
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40}; // 총 4개 요소 (고정된 값)
        int key = 25;               // 찾고 싶은 값 (없는 값!)

        int result = seqSearch(a, key);

        System.out.println("------------------------------------------------");
        if (result == -1) {
            System.out.println("해당 값은 배열에 없습니다.");
        } else {
            System.out.println("해당 값은 'a[" + result + "]' 에 있습니다.");
        }

    }
}
