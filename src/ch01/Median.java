package ch01;

// 3개의 정숫값을 입력하고 중앙값을 구하여 출력
class Median {

    static int med3(int a, int b, int c){
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return b;
            else
                return c;
        else if (a > c)
            return  a;
        else if (b > c)
            return c;
        else
            return b;
        }


    } // end of med3



}
