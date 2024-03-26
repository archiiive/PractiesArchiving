package C;

public class C1_carMain3 {
    public static void main(String[] args) {


        //car타입의 배열객체 생성
        C1_class[] cars = new C1_class[3];

        //모든 인덱스에 new 연산자로 객체 생성 후 저장
        for (int i=0; i < cars.length; i++){
            cars[i] = new C1_class();
            cars[i].color = "White";
            cars[i].type = "2wd";
            cars[i].company = "kia";
        }
        System.out.println(cars[0].color);
        System.out.println(cars[1].color);
        System.out.println(cars[2].color);
        //System.out.println(cars[3].color);

    }
}
