import java.util.Scanner;

// int형 고정 길이 큐의 사용 예
public class IntQueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체
        IntQueue s = new IntQueue(64); // 최대 64개를 인큐할 수 있는 큐

        while (true){
            System.out.println(); // 메뉴 구분을 위한 빈 행 추가
            // 현재 큐 상태 출력 : "현재 데이터 개수 / 최대 용량
            System.out.printf("현재 데이터 개수: %d /%d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐  (2) 디큐  (3) 피크  (4) 덤프  (0) 종료 : ");

            int menu = stdIn.nextInt(); // 사용자의 메뉴 선택 입력받기
            if (menu == 0) break; // 0을 입력하면 프로그램 종료

            int x; // 데이터를 저장할 임시 변수

            switch (menu){
                case 1: // 인큐(데이터 삽입)
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt(); // 삽입할 데이터 입력받기
                    try {
                        s.enque(x);  // 큐에 데이터 삽입 입력 받기
                    } catch (IntQueue.OverflowIntQueueException e){ // 큐가 가득 찬 경우
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2: // 디큐(데이터 제거)
                    try {
                        x = s.deque(); // 큐에서 데이터 제거
                        System.out.println("디큐한 데이터는 '" + x + "' 입니다.");
                    } catch (IntQueue.EmptyIntQueueException e){ // 큐가 비어있는 경우
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3: // 피크(맨 앞 데이터 확인)
                    try {
                        x = s.peek(); // 데이터를 제거하지 않고 확인만
                        System.out.println("피크한 데이터는 '" + x + "' 입니다.");
                    } catch (IntQueue.EmptyIntQueueException e){ // 큐가 비어있는 경우
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4: // 덤프(모든 데이터 출력)
                    System.out.println("큐의 모든 데이터 : ");
                    s.dump(); // 큐의 모든 데이터를 순서대로 출력
                    break;

                default: // 잘못된 메뉴 선택 시
                    System.out.println("올바른 메뉴를 선택해 주세요.");
                    break;
            }
        } // end while - 무한 루프 종료
        System.out.println("프로그램을 종료합니다.");
        stdIn.close(); // Scanner 리소스 해제

        /*
            링 버퍼의 장점
            일반적인 배열로 큐를 만들면, 데이터를 제거할 때마다 모든 요소를 앞으로 이동시켜야 합니다.
            하지만 링 버퍼는 포인터만 이동시키면 되므로 훨씬 효율적입니다.

         */
    }
}
