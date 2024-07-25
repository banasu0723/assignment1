package calculator;
import java.util.*;

public class App {

    public static void main(String[] args) {
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
            intArray[cnt] = result;
            cnt++;
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            more = sc.next();
            if(more.equals("exit")){
                break;
            }else {
                if (cnt == 10) {
                    for (int i = 0; i < 9; i++) {
                        intArray[i] = intArray[i + 1];
                    }
                    cnt = 9;
                }
            }
        }

    }
}
