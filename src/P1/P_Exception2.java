package P1;

public class P_Exception2 {
    public static void main(String[] args) {

        System.out.println("다중 catchans");

        //여러개의 catch문이 존재하는 구문으로 발생된 예외별로 다른 예외처리를 할 수 있다,
        //3/0에서
        try {
            int[] Arr = {1,2,3};
            System.out.println(Arr[3]);
            System.out.println(3/0);
            Integer.parseInt("a");
        }catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없음");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위 초과");
        }catch (Exception e){
            System.out.println("예외 발생");
        }

    }

}
