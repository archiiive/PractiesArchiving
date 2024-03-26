package Java_quiz;

public class c_lass_Quiz03 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("홍길동",20,180);
        p1.info();
        System.out.println("-----");
        Person1 p2 = new Person1("홍킬동",40,170);
        p2.info();





    }
}


class Person1{

    int age;
    String name;
    int tall;

    Person1(String name,int age, int tall){
        this.age=age;
        this.name=name;
        this.tall=tall;
    }

    public void info(){
        System.out.println(name+"\n"+age+"세"+"\n"+"키: "+tall);
    }

}