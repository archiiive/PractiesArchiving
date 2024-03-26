package Java_quiz;

import java.util.Scanner;

public class m_thod_Quiz03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("키를 입력해주세요 : ");
        double sc1 = scan.nextDouble();
        System.out.println("나이를 입력해주세요 : ");
        int sc2 = scan.nextInt();

        if (sc1 >= 140){
            if (sc2 >= 8){
                System.out.println("놀이기구 탑승가능");
            }else {
                System.out.println("놀이기구 탑승 불가능");
            }
        }else {
            System.out.println("놀이기구 탑승 불가능");
        }

    }
}