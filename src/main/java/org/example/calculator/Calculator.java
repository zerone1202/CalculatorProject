package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    private List<Double> results = new ArrayList<>();

    //양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아
    public double calculate(int firstNum, int secondNum, char operator) {// 자동형변황 int->double
        double result = 0;

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
                } else {
                    result = (double) firstNum / secondNum;
                }
                break;
            default:
                System.out.println("지원하지 않는 연산 기호입니다.");
        }

        // 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.
        results.add(result);
        return result;
    }

    // 간접 접근을 통해 필드에 접근하여 가져올 수 있도록 구현합니다. (Getter 메서드)
    public List<Double> getResults() {
        return results;
    }

    // 간접 접근을 통해 필드에 접근하여 수정할 수 있도록 구현합니다. (Setter 메서드)
    public void setResults(List<Double> results) {
        this.results = results;
    }
}