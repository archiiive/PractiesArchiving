package Java_quiz;

public class c_lass_Quiz04 {
    public static void main(String[] args) {
        Account a1 = new Account("홍킬동",1234,9000);

        a1.deposit(800);
        a1.withDraw(1900);
        int a2 = a1.getBalace();
        System.out.println(a1.name+"님의 계좌 잔액은"+a2+"원입니다");
    }
}


class Account {
    String name;
    int password;
    int balace;

    public Account(String name,int password, int balace ){
        this.name=name;
        this.password=password;
        this.balace=balace;
    }

    public void deposit(int saveUp){
       balace += saveUp;
    }

    public void withDraw(int minus){
        balace -=minus;
    }
    public int getBalace(){
        return balace;
    }


}