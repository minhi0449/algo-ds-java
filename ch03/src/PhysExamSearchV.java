// 연습 3-7
// 신체 검사 데이터 배열에서 검색 (시력)

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Q7. 실습 3-8을 수정하여 시력을 내림차순으로 정렬한
// 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는 프로그램을 작성하세요.
public class PhysExamSearchV {
    //--- 신체 검사 데이터 ---//
    static class PhyscData {
        private String name;    // 이름
        private int height;     // 키
        private double vision;  // 시력

        //--- 생성자 ---//
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //--- 문자열 만들기 ---//
        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        //--- 시력 내림차순용 컴퍼레이터 ---//
        public static final Comparator<PhyscData> VISION_ORDER =
                new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2){
                return (d2.vision > d1.vision) ? 1 :
                        (d2.vision < d1.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = { // 배열 요소는 시력 오름차순으로 정렬
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("박준서", 175, 2.0),
        };
        System.out.print("검색할 시력은? : ");
        double vision = sc.nextInt();
        int idx = Arrays.binarySearch(
                x,                                          // 배열 x에서
                new PhyscData("", 0, vision),  // 키가 vision 인 요소를
                PhyscData.VISION_ORDER                      // VISION_ORDER 를 사용하여 검색
        );

        if (idx < 0) {
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
            System.out.println("데이터 : " + x[idx]);
        }
    }
}
