package C_lassQuiz05;

public class Wizard extends Player{
    @Override
    void action() {
        System.out.println("마법사는 귀여운 동작을 합니다.");
    }

    public static void main(String[] args) {
        Player pp = new Player();
        pp.action();
    }

    String name;
    int hp;
    int mp;


    void info(){
        System.out.println("케릭명 : "+name);

    }
    void iceArrow(){
        System.out.println("얼음화살 사용");
    }

}