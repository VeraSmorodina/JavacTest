import java.util.Scanner;
import CalculateArea.CalculateArea;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника:");
        double a = scanner.nextDouble();
        System.out.println("Введите вторую сторону треугольника:");
        double b = scanner.nextDouble();
        System.out.println("Введите угол:");
        double angle = scanner.nextDouble();
        System.out.println(CalculateArea.S(a,b,angle));
    }

}


