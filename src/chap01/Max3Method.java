package chap01;

public class Max3Method {
    // a, b, c의 최댓값을 구하여 반환
    static int max3(int a, int b, int c){
        int max = a; // 최댓값
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        return max; // 구한 최댓값을 호출한 곳으로 반환합니다.
    }

    public static void main(String[] args) {
        // 🅐🅑🅒🅓🅔🅕🅖🅗🅘🅙🅚🅛🅜 ⒶⒷⒸⒹⒺⒻⒼⒽⒾⓏⓀⓁⓂ ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜ
        // 🄰🄱🄲🄳🄴🄵🄶
        System.out.println();
        System.out.println("max3(3,2,1) =  " + max3(3, 2, 1)); // 🅐 a > b > c
        System.out.println("max3(3,2,2) =  " + max3(3, 2, 2)); // 🅑 a > b = c
        System.out.println("max3(3,1,2) =  " + max3(3, 1, 2)); // 🅒 a > c > b
        System.out.println("max3(3,2,3) =  " + max3(3, 2, 3)); // 🅓 a = c > b

        System.out.println("-----------------------------------------------------------");
        System.out.println("max3(2,1,3) =  " + max3(2, 1, 3)); // 🅔 c > a > b
        System.out.println("max3(3,3,2) =  " + max3(3, 3, 2)); // 🅕 a = b > c
        System.out.println("max3(3,3,3) =  " + max3(3, 3, 3)); // 🅖 a = b = c

        System.out.println("-----------------------------------------------------------");
        System.out.println("max3(2,2,3) =  " + max3(2, 2, 3)); // 🅗 c > a = b
        System.out.println("max3(2,3,1) =  " + max3(2, 3, 1)); // 🅘 b > a > c
        System.out.println("max3(2,3,2) =  " + max3(2, 3, 2)); // 🅙 b > a = c

        System.out.println("-----------------------------------------------------------");
        System.out.println("max3(1,3,2) =  " + max3(1, 3, 2)); // 🅚 b > c > a
        System.out.println("max3(2,3,3) =  " + max3(2, 3, 3)); // 🅛 b = c > a
        System.out.println("max3(1,2,3) =  " + max3(1, 2, 3)); // 🅜 c > b > a

        /*
            최댓값을 여러 번 반복해서 구할 떄에는 메서드로 처리하면 편합니다.
            04 ~ 13 행은 int 형 매개변수 a,b,c에 값을 받아 최댓값을 구하고
            그것을 int 형 값으로 반환하는 메서드

            --------------------------------------------------------------------

            [매개변수]
            메서드를 정의할 때, 메서드에 전달되는 값을 저장하기 위해 변수 (variable) 선언하는데,
            이를 매개변수 (parameter) 또는 형식매개변수 (formal parameter)라고 합니다.
            형식매개변수를 가인수(임시 인수)라 하고, 메서드를 호출할 때 사용하는 매개변숫값(value)을
            실인수(actual argument)라고 합니다. 간단하게 메서드를 정의할 때는 '매개변수', 메서드를 호출할 때는 '실인수' 라고 생각하면 됩니다.

            [main 메서드]
            main 메서드는 max3 메서드에 세 값을 실인수로 주어 호출하고 반환값을 화면에 13회 출력합니다.

            [알고리즘] 정의
            : 어떤 문제를 해결하기 위한 절차로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합



         */

    }


}
