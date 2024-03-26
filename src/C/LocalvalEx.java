package C;

public class LocalvalEx {
    public static void main(String[] args) {




        Local local = new Local();
        System.out.println(local.name); //null

        local.process();
        System.out.println(local.name); //local에 name을 가져옴

        local.printAge();
        local.printAge2();

        //for문 블록 내에서의 변수 선언
        for (int i = 0; i < 10; i++) {
            int temp = 0;
            temp +=i;
        }




    }
}

class Local{
    String name;

    void process(){
        name = "hong";
    }

    void printAge(){
        int age = 20; //지역변수
        System.out.println(age);
    }

    void printAge2(){
    int age = 30;
        System.out.println(age);
    }
}
