package enumeration.ref3;

import static enumeration.ref3.Grade.*;

//중복제거 리팩토링
public class EnumRefMain3_3 {
    public static void main(String[] args) {
        int price = 10000;

        printDiscount(BASIC, price);
        printDiscount(GOLD, price);
        printDiscount(DIAMOND, price);
    }

    public static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " = " + grade.discount(price));
    }
}