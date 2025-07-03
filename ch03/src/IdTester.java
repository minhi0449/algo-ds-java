// 실습 3C-1
// 아이디를 부여하는 클래스
class Id {
    // 모든 객체가 공유하는 카운터. 아이디를 몇 개 만들었는지 저장
    private static int counter = 0; // (클래스 변수)아이디를 몇 개 부여했는지 저장
    private int id;                 // (인스턴스 변수)아이디 - 각 객체(인스턴스)만 가지는 고유한 아이디


    // 생성자
    // 객체가 생성될 때 호출되며, 아이디를 자동으로 부여함
    public Id() {
        id = ++counter; // counter 값을 1 증가 시키고, 그 값을 id에 저장
    }

    // counter 를 반환하는 클래스 메서드
    // 지금까지 몇 개의 아이디가 생성되었는지 반환하는 클래스 메서드
    public static int getCounter() {
        return counter;
    }

    // 아이디를 반환하는 인스턴스 메서드
    // 객체가 가진 고유 아이디를 반환하는 인스턴스 메서드
    public int getId() {
        return id;
    }
}

// 테스트 클래스
public class IdTester {
    public static void main(String[] args) {
        Id a = new Id(); // 아이디 1 - 새로운 객체 a 생성 -> id = 1
        Id b = new Id(); // 아이디 2 - 새로운 객체 b 생성 -> id = 2

        System.out.println("a의 아이디 : " + a.getId()); // a의 아이디 출력
        System.out.println("b의 아이디 : " + b.getId()); // b의 아이디 출력

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter()); // 지금까지 생성된 객체 수 출력

        /*
            클래스 변수 counter 는 인스턴스와 관계없이 1개만 만들어지고,
            특정 시점에 아이디를 몇 번까지 부여했는가를 알 수 있습니다.
            인스턴스 변수 id 는 인스턴스마다 각자 1개씩 할당되고,
            해당 인스턴스의 아이디를 나타냅니다.
            클래스 메서드 getCounter 는 마지막에 부여한 아이디를 반환하고,
            인스턴스 메서드 getId 는 개별 인스턴스의 아이디를 반환합니다.

            인스턴스 메서드와 클래스 메서드를 호출하는 방식은
            • 인스턴스 메서드 호출 : 클래스형 변수 이름.메서드 이름(...)
            • 클래스 메서드 호출 : 클래스 이름.메서드 이름(...)

         */
    }
}
