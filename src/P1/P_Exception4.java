package P1;

public class P_Exception4 {
    public static void main(String[] args) {


        //3/0 구문에서 예외처리가 발생하고
        //finally 구문도 출력된다

        System.out.println("DB연결 시작");
        try {
            System.out.println("DB작업");
            System.out.println(3/0);
        }catch (Exception e){
            System.out.println("DB작업 중 예외 발생");
        }finally {
            System.out.println("DB연결 종료");
        }
    }
}
