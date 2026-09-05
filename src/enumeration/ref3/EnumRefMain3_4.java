package enumeration.ref3;

import static enumeration.ref3.Grade.*;

//Enum의 values 함수를 이용한 Enum 객체 추가 시에도 main 수정 없이 출력 가능
public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;

        Grade[] values = values();
        for (Grade value : values) {
            printDiscount(value, price);
        }
    }

    public static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " = " + grade.discount(price));
    }
}