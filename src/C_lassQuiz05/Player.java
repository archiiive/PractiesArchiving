package C_lassQuiz05;

public class Player {
    String name;
    int hp;
    int mp;

    void action(){
        System.out.println(" ");
    }


    void info(){
        System.out.println("캐릭이름 : " + name);
        System.out.println("체력 : "+hp);
        System.out.println("마나 : "+mp);
    }

    void bash(){
        System.out.println("때리기 스킬 사용");
    }
    void iceArrow(){
        System.out.println("얼음화살 사용");
    }


}