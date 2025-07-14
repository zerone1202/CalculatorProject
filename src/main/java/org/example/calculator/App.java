package org.example.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        Calculator calculator = new Calculator(); // Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정

        // 반복문 사용 해서 연산을 반복
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.println("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("사칙연산 기호를 입력하세요: "); // Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
            char operator = sc.next().charAt(0); // 문자열에서 첫 글자만 가져옵니다.
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

            // 연산 수행 역할은 Calculator 클래스가 담당, switch문 제거
            double result = calculator.calculate(firstNum, secondNum, operator);
            System.out.println("결과: " + result);

            // 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
            List<Double> results = calculator.getResults();
            System.out.println("지금까지의 결과: ");
            for (int i = 0; i < results.size(); i++) {
                System.out.println((i + 1) + "번째 계산 결과: " + results.get(i));
            }

            // 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
            System.out.println("초기화하려면 'reset'을 입력하세요. (enter 입력 시 계속)");
            String reset = sc.nextLine();

            if (reset.equalsIgnoreCase("reset")) {
                calculator.setResults(new ArrayList<>()); // 계산 결과들 초기화
                System.out.println("결과가 초기화되었습니다.");
            }
            
            System.out.println("더 계산 하시겠습니까? (exit 입력 시 종료)");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
            // exit을 입력 받으면 반복문 종료
        }
    }
}

