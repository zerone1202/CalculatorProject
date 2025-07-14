package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private List<Double> results = new ArrayList<>();

//    사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
//    연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
//    1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후
//    2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.

    //양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아
    public double calculate(int firstNum, int secondNum, char operator) {// 자동형변황 int->double
        double result;

        switch (operator) {
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = (double) firstNum / secondNum;
                break;
            default:
                System.out.println("지원하지 않는 연산 기호입니다.");
        }

        // 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드필드를 가진 Calculator 클래스를 생성합니다.
        results.add(result);
        return result; /* return 연산 결과 */
    }
}