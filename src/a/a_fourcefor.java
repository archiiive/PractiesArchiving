package a;

import java.util.Arrays;

public class a_fourcefor {
    public static void main(String[] args) {
        //향상된 for문

        //배열
        int[] arrInt = {1,2,3,4,5};
        //기존 for문을 이용한 출력
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print(arrInt[i]+"\t");
        }

        System.out.println();

        //향상된 for문을 이용한 출력
        for (int number : arrInt){
            System.out.print(number+"\t");
        }

        System.out.println();

        //배열선언
        String[] name1 = {"홍길동","이순신","김유신"};
        int[] scores = {90,80,70};
        int i = 0;

        for (String name : name1){
            System.out.println(name+ " : " + scores[i]);
            i++;
        }



    }
}
