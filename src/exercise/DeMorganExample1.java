package exercise;

// 드모르간 법칙 : 부정(!)과 괄호 안 논리연산을 각각 따로 부정하면서 연산자도 바꿔주는 법칙
// 논리 연산자에서 '부정'이 어떻게 분배되는지 알려주는 법칙
// 조건문을 쓸 때 자주 등장하며, 복잡한 조건을 쉽게 바꾸거나 해석할 수 있게 도와줌
/*
    드모르간 법칙(De Morgan's Law)이란?
    --> 논리 연산자를 변형하는 규칙
    !(A && B) -> !A || !B
    &&로 묶인 조건을 부정하면 ||로 바뀌고,
    ||로 묶인 조건을 부정하면 &&로 바뀜.
    이 과정에서 각 조건에도 !가 붙어서 반대가 됨

    • 괄호로 묶인 조건을 부정(!) 할 때,
    • 각 조건을 개별적으로 부정(!) 하고,
    • 논리 연산자(&&, ||)를 서로 반대로 바꿔주는 규칙

    [논리연산자]
    && AND(그리고): 둘 다 참이어야 함
 */
public class DeMorganExample1 {
    public static void main(String[] args) {
        boolean isRaining = true; // 비가 오는지 저장하는 변수. true는 '비가 온다'를 의미
        boolean isWindy = false;  // 바람이 부는지 저장하는 변수. false는 '바람이 안 분다'를 의미

        // 드모르간 법칙 적용 전
        boolean stayHome1 = !(isRaining && isWindy); // '비가 오고 바람이 부는' 상황의 부정. 결과는 true

        // 드모르간 법칙 적용 후
        boolean stayHome2 = !isRaining || !isWindy;  // '비가 안 오거나 바람이 안 부는' 상황. 결과는 true

        System.out.println("비가 오고 바람이 불지 않음의 부정: " + stayHome1);
        System.out.println("비가 오지 않거나 바람이 불지 않음: " + stayHome2);

        // 검증: 두 결과는 같아야 함
        System.out.println("드모르간 법칙 검증: " + (stayHome1 == stayHome2)); // 두 결과가 같은지 확인. true 출력


    }
}
