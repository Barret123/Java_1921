import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первую сторону: ");
        double side1 = sc.nextDouble();

        System.out.print("Введите вторую сторону: ");
        double side2 = sc.nextDouble();

        Rectangle rectangle = new Rectangle();   // создаём экземпляр класса

        double result = rectangle.areaCalculate(side1,side2);
        System.out.println("Площадь: " + result);
        double result1 = rectangle.perimeterCalculator(side1, side2);
        System.out.println("Периметр: " + result1);
    }
}
