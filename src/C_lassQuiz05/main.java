package C_lassQuiz05;

public class main extends Player{


    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("-----마법사-----");
        p1.name="구르미그린달빛";
        p1.hp =500;
        p1.mp=1000;
        p1.info();
        p1.iceArrow();
        System.out.println("-----전사-----");
        p2.name="강한친구대한전사";
        p2.hp=1000;
        p2.mp=500;
        p2.info();
        p2.bash();

        System.out.println("=====마법사=====");
        Wizard wz = new Wizard();
        wz.action();
        System.out.println("=====전사=====");
        Warrior wr = new Warrior();
        wr.action();


    }
}