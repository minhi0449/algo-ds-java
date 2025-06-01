import java.util.Scanner;

/**
 * 세 가지 선형 검색 방법 비교 및 성능 측정
 * 1. while문 기본 방식 (SeqSearch)
 * 2. for문 방식 (SeqSearchFor)
 * 3. 보초법 (SeqSearchSen)
 */
public class SearchComparison {

    // *** [방법 1] while문 기본 방식 - 가장 기본적인 선형 검색
    static int seqSearchWhile(int[] a, int n, int key) {
        System.out.println("    [While 방식] 검색 시작...");
        int i = 0;
        int conditionChecks = 0; // 조건 검사 횟수 카운트

        while (true) {
            conditionChecks++; // 첫 번째 조건 체크
            if (i == n) {  // 배열 끝까지 왔는지 확인
                System.out.println("    → 총 조건 검사 횟수: " + conditionChecks + "번");
                return -1; // 검색 실패
            }

            conditionChecks++; // 두 번째 조건 체크  
            if (a[i] == key) { // 찾는 값인지 확인
                System.out.println("    → 총 조건 검사 횟수: " + conditionChecks + "번");
                return i; // 검색 성공
            }
            i++;
        }
    }

    // *** [방법 2] for문 방식 - 범위 관리가 자동화된 방식
    static int seqSearchFor(int[] a, int n, int key) {
        System.out.println("    [For 방식] 검색 시작...");
        int conditionChecks = 0; // 조건 검사 횟수 카운트

        for (int i = 0; i < n; i++) { // for문이 범위 체크 자동 관리
            conditionChecks += 2; // 내부적으로 i < n 체크 + a[i] == key 체크
            if (a[i] == key) {
                System.out.println("    → 총 조건 검사 횟수: " + conditionChecks + "번");
                return i; // 검색 성공
            }
        }
        System.out.println("    → 총 조건 검사 횟수: " + conditionChecks + "번");
        return -1; // 검색 실패
    }

    // *** [방법 3] 보초법 - 최적화된 방식
    static int seqSearchSentinel(int[] a, int n, int key) {
        System.out.println("    [보초법] 검색 시작...");
        int i = 0;
        int conditionChecks = 0; // 조건 검사 횟수 카운트

        // *** [핵심] 보초 설치 - 배열 끝에 찾는 값을 미리 배치
        int originalValue = a[n]; // 원래 값 백업 (혹시 있다면)
        a[n] = key; // 보초 설치!
        System.out.println("    → 보초 설치 완료: a[" + n + "] = " + key);

        while (true) {
            conditionChecks++; // 오직 한 번의 조건 체크만!
            if (a[i] == key) { // 값 비교만 하면 됨
                break; // 반드시 찾게 됨 (보초 덕분에)
            }
            i++;
        }

        // 보초 원상 복구
        a[n] = originalValue;

        System.out.println("    → 총 조건 검사 횟수: " + conditionChecks + "번");

        // *** [핵심] 결과 판단: 진짜 찾았는지, 보초에서 멈췄는지 확인
        if (i == n) {
            System.out.println("    → 보초에서 멈춤 = 실제로는 존재하지 않음");
            return -1; // 보초에서 멈춤 = 실제로는 없음
        } else {
            System.out.println("    → 원본 배열에서 발견!");
            return i; // 원본 배열에서 찾음
        }
    }

    // 배열 상태를 시각적으로 출력하는 메서드
    static void printArrayStatus(int[] array, int size, String description) {
        System.out.print(description + ": [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.print("]");

        // 보초 공간이 있다면 별도 표시
        if (array.length > size) {
            System.out.print(" + 보초공간[" + array[size] + "]");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 세 가지 선형 검색 방법 비교 시연 ===\n");

        // 배열 크기 입력
        System.out.print("요솟수 입력: ");
        int num = sc.nextInt();

        // *** [중요] 보초법을 위해 크기를 1 크게 만듦
        int[] x = new int[num + 1]; // 보초 공간 포함

        // 배열 요소 입력
        System.out.println("\n배열 요소를 입력하세요:");
        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        printArrayStatus(x, num, "입력된 배열");

        // 검색할 값 입력
        System.out.print("\n검색할 값: ");
        int key = sc.nextInt();

        System.out.println("\n" + "=".repeat(50));
        System.out.println("세 가지 방법으로 동시에 검색을 시작합니다!");
        System.out.println("=".repeat(50));

        // *** [성능 비교] 세 방법 동시 실행

        // 1. While 방식
        System.out.println("\n【방법 1】 While문 기본 방식:");
        long startTime = System.nanoTime();
        int result1 = seqSearchWhile(x, num, key);
        long time1 = System.nanoTime() - startTime;

        // 2. For 방식  
        System.out.println("\n【방법 2】 For문 방식:");
        startTime = System.nanoTime();
        int result2 = seqSearchFor(x, num, key);
        long time2 = System.nanoTime() - startTime;

        // 3. 보초법
        System.out.println("\n【방법 3】 보초법:");
        startTime = System.nanoTime();
        int result3 = seqSearchSentinel(x, num, key);
        long time3 = System.nanoTime() - startTime;

        // *** [결과 분석 및 출력]
        System.out.println("\n" + "=".repeat(50));
        System.out.println("✓ 검색 결과 분석");
        System.out.println("=".repeat(50));

        if (result1 != -1) {
            System.out.println("✅ 찾았습니다! 위치: x[" + result1 + "] = " + x[result1]);
        } else {
            System.out.println("❌ 찾을 수 없습니다.");
        }

        // 결과 일치성 검증
        if (result1 == result2 && result2 == result3) {
            System.out.println("✰ 세 방법 모두 동일한 결과를 반환했습니다.");
        } else {
            System.out.println("❌ 오류: 결과가 다릅니다!");
            System.out.println("   While: " + result1 + ", For: " + result2 + ", Sentinel: " + result3);
        }

        // *** [성능 비교 결과]
        System.out.println("\n✓ 성능 비교 결과:");
        System.out.println("   While문 방식  : " + time1 + " 나노초");
        System.out.println("   For문 방식    : " + time2 + " 나노초");
        System.out.println("   보초법        : " + time3 + " 나노초");

        // 가장 빠른 방법 찾기
        long minTime = Math.min(Math.min(time1, time2), time3);
        System.out.print("\n✓ 가장 빠른 방법: ");
        if (time3 == minTime) {
            System.out.println("보초법! (예상대로 최적화됨)");
        } else if (time2 == minTime) {
            System.out.println("For문 방식");
        } else {
            System.out.println("While문 방식");
        }

        // *** [교육적 설명]
        System.out.println("\n✓ 핵심 포인트:");
        System.out.println("   • While/For문: 매번 '범위 체크' + '값 비교' = 2번 확인");
        System.out.println("   • 보초법: 매번 '값 비교'만 = 1번 확인 (약 50% 조건 검사 감소)");
        System.out.println("   • 보초법은 메모리 1개를 더 써서 속도를 높이는 트레이드오프");
        System.out.println("   • 큰 데이터에서는 이 차이가 더욱 중요해집니다!");

        sc.close();
    }
}