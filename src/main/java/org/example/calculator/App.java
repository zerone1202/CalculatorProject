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

        System.out.println("입력된 연산 기호: " + operator);


    }
}
