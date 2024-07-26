package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        int[] intArray = new int[10];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int num1, num2, result = 0;
        char calculate ;
        String more;


        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            result = 0;
            calculate = sc.next().charAt(0);

            switch (calculate) {
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
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    } else {
                        result = num1 / num2;
                        System.out.println("결과: " + result);
                    }
                    break;
            }
            intList.add(result);
            //intArray[cnt] = result;
            cnt++;
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            more = sc.next();
            if(more.equals("remove")){
                intList.remove(0);
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            more = sc.next();
            if(more.equals("inquiry")){
                for(Integer e : intList){
                    System.out.println(e);
                }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            more = sc.next();
            if(more.equals("exit")){
                break;
            }
        }

    }
}
