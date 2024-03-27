package C_lassQuiz05;

public class Warrior extends Player{
    @Override
    void action() {
        System.out.println("전사는 멋진 동작을 합니다.");
        super.action();
    }

    String name;
    int hp;
    int mp;

    void iceArrow(){
        System.out.println("얼음화살 사용" +
                "");
    }
}