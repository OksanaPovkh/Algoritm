package util.Scanner2;

public class Main2 {

    public static int add(int a, int b){
        return  a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println("Сложение: " + add(a, b));
        System.out.println("Вычитание: " + subtract(a, b));
        System.out.println("Умножение: " + multiply(a, b));
        System.out.println("Деление: " + divide(a, b));
    }
}
