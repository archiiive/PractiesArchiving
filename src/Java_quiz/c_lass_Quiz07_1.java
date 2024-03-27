package Java_quiz;

import java.util.Arrays;

public class c_lass_Quiz07_1 {
    public static void main(String[] args) {

        ArrayPrint ap = new ArrayPrint();
        ap.PrintArray();



    }
}


class ArrayPrint{

    String[] sArr ={"홍길동","이순신","김길동"};
    int[] iArr = {1,2,3,4,5};
    char[] cArr ={'가','나'};

    void PrintArray(){
        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(cArr));
    }
}