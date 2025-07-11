import java.util.Optional;

// 연습 4-3
// 머리가 둘인 int형 고정 길이 스택
// 양쪽 끝에서 접근할 수 있는 정수형 스택 클래스 정의
// 양쪽 끝에서 데이터를 넣고 뺼 수 있는 특별한 스택 구조
public class DoubleHeadIntStack {
    private int[] stk;      // 스택의 본체 - 실제 데이터를 저장하는 배열
    private int capacity;   // 전체 스택 용량 (A B의 합계)
    private int ptrA;       // 스택 A의 포인터 (왼쪽부터 시작)
    private int ptrB;       // 스택 B의 포인터 (오른쪽부터 시작)

    public enum AorB {StackA, StackB};

    //--- 실행 시 예외 : 스택이 비어 있음 ---//
    public class EmptyDoubleHeadIntStackException extends RuntimeException {
        public EmptyDoubleHeadIntStackException() {}
    }

    //--- 실행 시 예외 : 스택이 가득 참 ---//
    public class OverflowDoubleHeadIntStackException extends RuntimeException {
        public OverflowDoubleHeadIntStackException() {}
    }

    //--- 생성자 ---//
    public DoubleHeadIntStack(int maxlen){
        ptrA = 0;
        ptrB = maxlen - 1;
        capacity = maxlen;
        try {
            stk = new int[capacity];  // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e){ // 생성할 수 없음
            capacity = 0;
        }
    }

    //--- 스택에 x를 푸시 ---//
    public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
        if (ptrA >= ptrB + 1){ // 스택이 가득 참
            throw new OverflowDoubleHeadIntStackException();
        }
        switch (sw) {
            case StackA: stk[ptrA++] = x; break;
            case StackB: stk[ptrB--] = x; break;
        }
        return x;
    }

    //--- 스택에서 데이터를 팝(꼭대기의 데이터를 꺼냄) ---//
    public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0) { // 스택 A가 비어 있음
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[--ptrA];
                break;
            case StackB:
                if (ptrB >= capacity - 1){  // 스택 B가 비어 있음
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[++ptrB];
                break;
        }
        return x;
    }

    //--- 스택에서 데이터를 피크(꼭대기의 데이터를 들여다 봄) ---//
    public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0){ // 스택 A가 비어 있음
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[ptrA - 1];
                break;
            case StackB:
                if (ptrB >= capacity - 1) { // 스택 B가 비어 있음
                    throw new EmptyDoubleHeadIntStackException();
                }
                x = stk[ptrB + 1];
                break;
        }
        return x;
    }

    //--- 스택에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환합니다. ---//
    public int indexOf(AorB sw, int x){
        switch(sw){
            case StackA:
                for (int i = ptrA - 1; i >= 0; i--) {
                    if (stk[i] == x){
                        return i;
                    }
                }
            break;
            case StackB:
                for (int i = ptrB + 1; i < capacity; i++){
                    if (stk[i] == x){
                        return i;
                    }
                }
            break;
        }
        return -1;
    }

    //--- 스택을 비웁니다. ---//
    public void clear(AorB sw){
        switch (sw){
            case StackA: ptrA = 0; break;
            case StackB: ptrB = capacity - 1; break;
        }
    }

    //--- 스택 용량을 반환합니다.(A와 B의 합계) ---//
    public int getCapacity() {return capacity;}

    //--- 스택에 쌓여있는 데이터 수를 반환합니다. ---//
    public int size(AorB sw){
        switch (sw){
            case StackA: return ptrA;
            case StackB: return capacity - ptrB - 1;
        }
        return 0;
    }

    //--- 스택이 비어 있는가? ---//
    public boolean isEmpty(AorB sw){
        switch (sw) {
            case StackA: return ptrA <= 0;
            case StackB: return ptrB >= capacity - 1;
        }
        return true;
    }

    //--- 스택이 가득 찼는가? ---//
    public void dump(AorB sw){
        switch(sw){
            case StackA:
                if (ptrA <= 0){
                    System.out.println("스택이 비어 있습니다.");
                } else {
                    for (int i = 0; i < ptrA; i++){
                        System.out.println(stk[i] + " ");
                    }
                    System.out.println();
                }
            break;
            case StackB:
                if (ptrB >= capacity - 1){
                    System.out.println("스택이 비어 있습니다.");
                } else {
                    for (int i = capacity - 1; i > ptrB; i--){
                        System.out.println(stk[i] + " ");
                    }
                    System.out.println();
                }
            break;
        }
    }
}

