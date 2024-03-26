package Java_quiz;
//1. Math.random() 을 이용하여-5 ~ 5 의 랜덤 수를 발생시키세요.
//        2. 3항 연산 식을 사용 해서, 절대값을 구하는 식을 세우세요.
public class m_ethod_Quiz02 {
    public static void main(String[] args) {

        int rand = (int)(Math.random()*5)+1;

        System.out.println("랜덤값은 : "+rand);
        System.out.println("절대값은 : " + (rand - 5 >= 0 ? rand : -rand) );
    }
}