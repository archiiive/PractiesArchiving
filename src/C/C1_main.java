package C;



public class C1_main {
    public static void main(String[] args) {

        C1_class car = new C1_class();
        C1_class car2 = new C1_class();

        car.color ="화이트";
        car.company = "HYUDAI";
        car.type="4WD";

        car2.color="BLACk";
        car2.company="KIA";
        car2.type="2WD";

        car.go();
        car2.go();
        System.out.println(car.color+"\t"+car.company+"\t"+car.type);

    }
}
