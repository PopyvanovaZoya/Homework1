package ru.geekbrains.homework1;

public class Sample01 {
    public static void main(String[] args) {
        byte byteVal = 125;
        short shortVal = -30000;
        int intVal = 11;
        long longVal = 2342349845986456L;
        float floatVal = 10.56f;
        double doubleVal = -12.765;

        boolean booleanVal = true;

        float a = 1.1f;
        float b = 0.2f;
        float c = -4.8f;
        float d = -0.3f;


        float totalResult01 = result(a, b, c, d);
        System.out.println(totalResult01);

        int number1 = 2;
        int number2 = 10;

        boolean totalResult02 = isInBounds(number1, number2);
        System.out.println(totalResult02);

        int number3 = 4;
        positiveOrNegative(number3);

        int number4 = -5;
        boolean totalResult03 = isPositive(number4);
        System.out.println(totalResult03);

        String name = "Петя";
        greeting(name);

        int year = 1996;
        isLeapYear(year);

    }

    public static float result(float a, float b, float c, float d) {
        float res = a * (b + (c / d));
        return res;


    }

    public static boolean isInBounds(int number1, int number2) {
        int sumOfNumbers = number1 + number2;
        return sumOfNumbers >= 10 && sumOfNumbers <= 20;
    }

    public static void positiveOrNegative(int number3) {
        if (number3 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isPositive(int number4) {
        return number4 >= 0;
    }

    public static void greeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) ||(year % 400 == 0)) {
            System.out.println("Год високосный");
        }
            else{
            System.out.println("Год не високосный");
        }
    }
}

