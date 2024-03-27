package Java_quiz;

public class c_lass_Quiz07 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.add(1);
        cal.add(2,3);
        cal.add(1,2,3);
        cal.add(1,2,3,4);

    }
}

class Calculator{

    int result ;
    public void add(int num){
        result += num;
        System.out.println("cal1의 누적값"+result);
    }
    public void add(int num1, int num2){
        result += num1 + num2;
        System.out.println("cal2의 누적값"+result);
    }

    public void add(int num3, int num4,int num5){
        result += num3+num4+num5;
        System.out.println("cal3의 누적값"+result);
    }
    public void add(int num6, int num7,int num8,int num9){
        result += num6+num7+num8+num9;
        System.out.println("cal4의 누적값"+result);
    }







}