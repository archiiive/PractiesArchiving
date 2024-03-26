package Java_quiz;
//1. 양의 정수를 입력 받아 짝수 라면 “x 는 짝수 입니다” ,
// 홀수 라면 “x는 홀수 입니다” 를 출력하세요.

import java.util.Scanner;

// 2. 0이라면 “0입니다“
//  3. 음수 라면 “음수 입니다“ 를 출력하세요.
public class m_thod_Quiz05 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
    int sc = scan.nextInt();

    if(sc > 0){
        System.out.println(sc+"는"+(sc % 2 == 0 ? "찍수입니다" : "홀수입니다."));
    } else if (sc < 0){
        System.out.println(sc+"는 음수입니다");
    }else {
        System.out.println("0 입니다");
    }


    }
}