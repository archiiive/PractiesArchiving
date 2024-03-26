package C;

public class VarEx {
    public static void main(String[] args) {
        //클래스 변수 사용
        System.out.println("Avante Clafter : "+Avante.company);
        Avante a1 = new Avante();
        Avante a2 = new Avante();

        //인스턴스 변수의 값 변경
        a1.color = "White";
        a2.color = "black";

        //인스턴스 변수 출력
        System.out.println("a1 colors : " + a1.color);
        System.out.println("a2 colors : " + a2.color);

        //클래스 변수를 인스턴스 객체로 출력
        System.out.println("a1 claft : " + a1.company);
        System.out.println("a2 claft : "+ a2.company);

        //클래스 변수의 값 변경
        a1.company = " kia ";

        //클래스 변수의 값 변경 후 클래스 변수와 인스턴스변수 출력
        System.out.println("Avante calft : " +Avante.company);
        System.out.println("a1 craft : " + a1.company);
        System.out.println("a2 craft : " + a2.company);
    }
}

class Avante{
    String color; //인스턴스변수
    static String company = "현대"; //클래스변수
}