package Lesson_01;

public class HomeWorkAdd {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
        System.out.println("*********************");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = -12;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
            System.out.println("*********************");
        }
    }
    public static void printColor() {
        int value = 120;
        if (value <= 0) {
            System.out.println("Красный");
        } else { if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");

        }  System.out.println("*********************");
        }
    }
    public static void compareNumbers() {
        int a = 50;
        int b = 30;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
