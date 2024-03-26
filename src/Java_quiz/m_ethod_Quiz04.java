package Java_quiz;

import java.util.Scanner;

public class m_ethod_Quiz04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 입력해주세요\n ");
        System.out.print( ">>");
        int sc1 = scan.nextInt();
        System.out.print(">>");
        int sc2 = scan.nextInt();

        if (sc1 > sc2){
            System.out.println(sc1 + "이 더 큰 수 입니다");
        }else if(sc1 < sc2){
            System.out.println(sc2 + "가 더 큰 수 입니다.");
        }else {
            System.out.println("둘이 같은 수 입니다.");
        }


    }
}