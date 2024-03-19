package P1;

public class P_Exception {
    public static void main(String[] args) {

        /*   아래 프린트를 출력하면
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at P1.P_Exception.main(P_Exception.java:8)
	 에러가 나오는데 예외처리로 이 에러를 건너 값을 출력할수 있다.
	 try~ catch 는 Exception 이 나와도 프로그램을 종료하지 않고 끝까지 출력한다.*/

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3/0);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);




        //프린트 3/0 연산을 하는경우 예외가 발생한다
        //try~ catch 문으로 1,2까지 출력을 하다 3/0 라인을 출력하지않고 프로그램도 종료되지 않는다.
        System.out.println("try 블록에서 예외가 발생한 경우");
        System.out.print(1);
        try{
            System.out.print(2);
            System.out.print(3/0);
            System.out.print(4);
        }catch (ArithmeticException e){
            System.out.print(5);
        }
            System.out.print(6);


        System.out.println();

        //try블록    안에서 예외가 발생한 경우
        //발생한 예외와 일치하는 catch문이 있는지 확인한다.
        //만약 일치하는 catch문이 있다면 해당 catch 문의 블럭 내의 실행문들을 실행하고 , 전체 try - catch구문이 종료된다,
        //Try블럭 안에서 예외가 발생하지 않은 경우
        //-catch 구문을 모두 확인하지 않고 전체 try catch구문이 종료된다.

        System.out.println("try블록 안에서 예외가 발생하지 않은 경우");

        System.out.print(1);
        try{
            System.out.print(2);
            System.out.print(3);
            System.out.print(4);
        }catch (ArithmeticException e){
            System.out.print(5);
        }
        System.out.print(6);
        //예외가 발생하지 않았기에 catch문의 실행문이 실행되지 않았다.






    }
}
