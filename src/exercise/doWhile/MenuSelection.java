package doWhile;

import java.util.Scanner;

// 메뉴 선택 프로그램
public class MenuSelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== 메뉴 ======");
            System.out.println("1. 안녕하세요 출력");
            System.out.println("2. 오늘의 날짜 출력");
            System.out.println("3. 프로그램 버전 출력");
            System.out.println("4. 종료");
            System.out.println("=================");
            System.out.print("> 메뉴를 선택하세요 : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("① 안녕하세요!");
                    break;
                case 2:
                    System.out.println("② 오늘 날짜 : 2025년 5월 19일");
                    break;
                case 3:
                    System.out.println("③ 프로그램 버전 : 1.0");
                    break;
                case 4:
                    System.out.println("④ 프로그램을 종료합니다...");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 1-4 사이의 숫자를 입력하세요.");
            }

        } while (choice != 4);

        sc.close();

        /*
            [코드해석]
            1. 메뉴 화면 출력
            2. 사용자에게 메뉴 번호를 입력 받음
            3. switch 문을 사용하여 선택한 메뉴에 따라 다른 동작을 수행
            4. 사용자가 종료 메뉴(4번)를 선택할 때까지 (choice != 4) 이 과정을 반복

            * 화면에 메뉴가 표시되고, 원하는 메뉴 번호를 누르면 그에 맞는 서비스를 제공받습니다.
            주문을 마치겠다고 할 때까지 (4번 메뉴) 계속해서 메뉴를 선택할 수 있음
         */


    }
}
