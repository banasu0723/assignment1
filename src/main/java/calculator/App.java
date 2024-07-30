package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
        Calculator calCulate = new Calculator(); // Calculator 인스턴스 생성
        Scanner sc = new Scanner(System.in);
        String more;


        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            calCulate.calculate(num1,num2,operator);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            more = sc.next();
            if(more.equals("remove")){
                calCulate.removeResult(calCulate.intList);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            more = sc.next();
            if(more.equals("inquiry")){
                calCulate.inquiryResults(calCulate.intList);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            more = sc.next();
            if(more.equals("exit")){
                break;
            }
        }

    }


}