package Java_quiz;
//1. Math.random()을 사용해서 1~100까지 랜덤 정수를 발생시키세요.
//        2. i가 짝수라면 “짝수”, 홀수라면 “홀수” 를 출력하는 3항 연산식 을 세우세요.
public class Quiz_01 {
    public static void main(String[] args) {

        int rand = (int)(Math.random()*100)+1;
        if(rand % 2 == 0){
            System.out.println(rand+"찍수입니다");
        }else{
            System.out.println(rand + "홀수입니다.");
        }

        System.out.println(rand +"는"+(rand %2 == 0 ? "짝수" : "홀수"));

    }
}