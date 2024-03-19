package P1;

public class P_Exception3 {
    public static void main(String[] args) {

        //fianlly 구문
        //finally구문은 마지막에 실행된다는 의미로 예외없이 정상적으로 실행이 되던 예외가 발생하던 무조건 실행한다.

        System.out.println("DB연결 시작");
        try {
            System.out.println("DB작업");
        }catch (Exception e){
            System.out.println("DB작업 중 예외발생");
        }finally {
            System.out.println("DB연결 종료");
        }   //예외가 발생하지 않아서 Exception은 발동되지 않아 catch문은 발동되지 않았으며 finally문의 DB연결 종료가 출력된다.


    }
}
