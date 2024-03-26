package Java_quiz;

public class c_lass_Qiuz01 {
    public static void main(String[] args) {

        Bread bread = new Bread("피자빵\n",500);
        bread.printpr();
        Bread bread1 = new Bread("딸기케잌\n",1500);
        bread1.printpr();


    }
}


class Bread{

    int price;
    String name;

    public Bread(String name, int price){
        this.name = name;
        this.price =price;
    }

    public void printpr(){
        System.out.println(name+price+"원");
    }



}