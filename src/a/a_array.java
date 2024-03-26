package a;

import java.util.Arrays;

public class a_array {
    public static void main(String[] args) {


        int[] Arr; //초기화가 되지 않아서 사용이 불가능함
        //int Arr2[] =null;

       // System.out.println(Arr1);
     //   System.out.println(Arr2);

        int[] arr3 =new int[5]; ///길이가 5개인 배열 객체 생성
        arr3[0]=1;
        arr3[1]=2;
        arr3[2]=3;
        arr3[3]=4;
        arr3[4]=5;
        System.out.println(arr3.length);

        //문자열로 배열 선언하기
        String[] arrStr = new String[5];
        System.out.println(arrStr);

        //배열변수를 선언과 동시에 초기화 하는방법
        String[] aRR ={"이순신","홍길동","김유신"}; //0번인데스는 이순신 1번 인덱스는 홍길동 3번 인덱스는 김유신
        //System.out.println(aRR[3]);
        for (int i = 0; i < aRR.length; i++) {
            System.out.println(aRR[i]);
        }

        //배열카피

        //원본배열
        int[] Arr1 = {1,2,3,};
        //복사할 배열
        int[] Arr3 = null;

        Arr3 = Arrays.copyOf(Arr1,3);

        for (int i = 0; i < Arr3.length; i++) {
            System.out.println(Arr3[i]);
        }


        int [][] arr ={
                {1},
                {1,2},{1,2,3},{1,2,3,4}
        };

        System.out.println(arr.length);
        System.out.println(arr[2].length);

        System.out.println();
        //배열의 합과 평균 구하기
        int[] socore1 = {90,80,70,60};
        int total =0;
        int daverage = 0;

        for (int i = 0; i < socore1.length; i++) {
            total+=socore1[i];
            daverage = total/socore1.length;
        }

        System.out.println(total);//합
        System.out.println(daverage);


        int[] num1 = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]*num1[i]);

        }
    }
}
