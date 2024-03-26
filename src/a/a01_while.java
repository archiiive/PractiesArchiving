package a;

public class a01_while {
    //주사위 만들기
    public static void main(String[] args) {
        int sum =0;

        while (true){
        int num1=(int)(Math.random()*6)+1;
        int num2=(int)(Math.random()*6)+1;
            System.out.println(num1+","+num2);
        sum=num1+num2;
        if (num1*num2 == 25);
            System.out.println(sum+"");
            System.exit(0);
        }

        //주사위를 던져 6이 나왔을때 횟수를 카운트하는 식

//        while (true){
//            int rand = (int) (Math.random()*6)+1;
//            System.out.println("");
//        }

    }
}
