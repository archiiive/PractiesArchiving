package Java_quiz;

public class c_lass_Quiz02 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동",19);
        p1.info();
        Person p2 = new Person("홍킬동",30);
        p2.info();
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;

    }


    public void info(){
        System.out.println("이름\n "+name+" 나이\n"+age+"세");

    }

}