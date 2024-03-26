package Java_quiz;
/*
1. Warrior 클래스 와 Wizard 클래스는 동일 속성과 기능을 갖고 있습니다.
2. 동일한 속성, 기능들을 Player 클래스로 정의 하고 상속 시키세요.
3. main에서 두 클래스를 만들어 info()를 사용하여 다음 결과가 나오도록 하세요.
 */
public class c_lass_Quize05 {
    public static void main(String[] args) {
        Player p1 = new Player("강한친구대한전사", 1000, 500, "때리기 스킬 사용");
        Player p2 = new Player("구르미그린달빛", 500, 1000, "얼음화살 사용");
        System.out.println("---마법사---");
        p2.charinfo();
        System.out.println("---전사---");
        p1.charinfo();

    }

}

class Player{
    String name;
    int hp;
    int mp;
    String skill;

   public Player(String name, int hp, int mp,String skill){
       this.name = name;
       this.hp = hp;
       this.mp = mp;
       this.skill = skill;
   }



    void bash(){
        System.out.println("때리기 스킬 사용");
    }

    void iceArrow(){
        System.out.println("얼음화살 사용");
    }
    public void charinfo(){
        System.out.println("캐릭명 : "+name+"\n체력 : "+hp+"\n마나 : "+mp+"\n"+skill);
    }
}