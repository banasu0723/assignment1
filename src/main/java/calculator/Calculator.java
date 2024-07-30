package calculator;

import java.util.*;

public class Calculator {



    ArrayList<Integer> intList = new ArrayList<Integer>();

    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    //생성자 구현

    int result = 0;

    public void calculate(int num1, int num2, char operator){
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                }
                break;
        }
        intList.add(result);
    }

    public void removeResult(List<Integer> list){
        intList.remove(0);
    }

    public void inquiryResults(ArrayList<Integer> intList){
        for(int answer : this.intList){
            System.out.println(answer);
        }
    }

}
