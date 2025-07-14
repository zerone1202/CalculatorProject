package org.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//         Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
//         양의 정수는 각각 하나씩 전달 받습니다.
//         양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.

        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

        System.out.println("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.


//        Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
//        사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다. (`charAt(0)`)

        System.out.print("사칙연산 기호를 입력하세요: "); //  Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있습니다.
        char operator = sc.next().charAt(0); // 문자열에서 첫 글자만 가져옵니다.
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

//        키워드 : `if` `switch`
//        사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행합니다.
//        입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (예를 들면 if, switch)
//        연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
//        ex) “나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.“

        int result = 0;

        //  입력받은 연산 기호를 구분하기 위해 제어문을 사용합니다. (예를 들면 if, switch)
        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case  '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case  '/':
                if (secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");//연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
                    return;
                } else {
                    result = firstNum / secondNum;
                } break;
        default:}
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
        System.out.println("결과: " + result);
    }


    }

