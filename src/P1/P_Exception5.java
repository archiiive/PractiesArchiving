package P1;

public class P_Exception5 {
    public static void main(String[] args) {
        //예외 강제발생
        //throw라는 키워드를 사용하면 직접 예외를 강제로 발생시킬 수 있다.
        //throw 사용방법 throw new Exception("예외발생");

        System.out.println("프로그램 시작");
        try {
            throw new Exception("예외 발생");
        } catch (Exception e){
            System.out.println(e.getMessage()); //Exception객체를 생성후 문자열값을 넣어준후 getMessage로 호출 할수있다.
        }
        System.out.println("프로그램종료");

    }
}
