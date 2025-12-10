
// 실습 5-6
// 재귀 함수를 메모화로 구현
public class RecurMemo {
    static String[] memo;

    // 메모화를 도입한 recur 메서드
    static void recur(int n){
        if(memo[n + 1] != null){
            System.out.println(memo[n + 1]); // 메모를 출력
        } else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; // 메모화
            }
            else {
                memo[n + 1] = "";
            }
        }
    }
}
