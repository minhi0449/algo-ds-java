
// 실습 5-6
// 재귀 함수를 메모화로 구현
public class RecurMemo {
    static String[] memo;

    static void recur(int n){
        if(memo[n + 1] != null){
            System.out.println(memo[n + 1]);
        }
    }
}
