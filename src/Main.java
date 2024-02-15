import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника");
        System.out.print("Первая сторона: ");
        int a = scanner.nextInt();
        System.out.print("Вторая сторона: ");
        int b = scanner.nextInt();
        System.out.print("Третья сторона: ");
        int c = scanner.nextInt();

        int a2 = (int) Math.pow(a, 2);
        int b2 = (int) Math.pow(b, 2);
        int c2 = (int) Math.pow(c, 2);

        // Проверка на прямоугольный треугольник
        if (a2 + b2 == c2 || b2 + c2 == a2 || c2 + a2 == b2) {
            System.out.println("a, b и c являются сторонами прямоугольного треугольника");
        }
        // Проверка на равносторонний треугольник
        else if (a == b && b == c) {
            System.out.println("a, b и c являются сторонами равностороннего треугольника");
        }
        // Проверка на равнобедренный треугольник
        else if (a == b || b == c || c == a) {
            System.out.println("a, b и c являются сторонами равнобедренного треугольника");
        }
        // Проверка на невозможность образования треугольника
        else if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("a, b и c не являются сторонами треугольника");
        }
        // Если ни одно из условий не выполнено, значит это обычный треугольник
        else {
            System.out.println("a, b и c являются сторонами обычного треугольника");
        }
        scanner.close();
    }
}