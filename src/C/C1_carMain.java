package C;

public class C1_carMain {
    public static void main(String[] args) {
        C1_class[] car = new C1_class[3];
        C1_class k5 = new C1_class();

        k5.type = "4wd";
        k5.color = "black";
        k5.company = "kia";

        for (int i = 0; i < car.length; i++) {
            car[i] = k5;
        }
        System.out.println("2번 인덱스 color : "+car[2].color);
        car[1].color = "블랙";
        System.out.println("1번 인덱스 color" + car[1].color);


    }
}
