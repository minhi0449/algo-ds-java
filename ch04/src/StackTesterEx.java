import java.util.Scanner;

// 연습 4-2
// 제네릭 스택의 사용 예 (Gstack 클래스의 모든 메서드를 사용)
public class StackTesterEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> s = new Stack<String>(64);

        while (true) {
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 " +
                    "(4) 덤프 (5) 검색 (6) 비움 " +
                    "(7) 출력 (0) 종료 : ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            String x;

            switch (menu) {
                case 1: 						    // 푸시
                    System.out.print("데이터 : ");
                    x = sc.next();
                    try {
                        s.push(x);
                    } catch (Stack.OverflowGstackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2: 							// 팝
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (Stack.EmptyGstackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3: 					        // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (Stack.EmptyGstackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4:								// 덤프
                    s.dump();
                    break;

                case 5:								// 검색
                    System.out.print("검색할 데이터 : ");
                    x = sc.next();
                    int n = s.indexOf(x);
                    if (n >= 0)
                        System.out.println("꼭대기에서 " + (s.size() - n) +"번째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                    break;

                case 6:								// 비웁니다
                    s.clear();
                    break;

                case 7:								// 데이터 출력
                    System.out.println("용량 : " + s.getCapacity());
                    System.out.println("데이터수 : " + s.size());
                    System.out.println("비어 " + (s.isEmpty()	? "있습니다."
                            : "있지 않습니다."));
                    System.out.println("가득 차 " + (s.isFull() ? "있습니다."
                            : "있지 않습니다."));
                    break;
            }
        }
    }
}
