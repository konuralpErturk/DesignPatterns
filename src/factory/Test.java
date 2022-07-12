package factory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter first number");
        double num2 = input.nextDouble();

        CalculateFactory factory = new CalculateFactory();
        System.out.println("Enter calculate method");
        Calculate calculate = factory.getCalculation(input.next());
        calculate.calculate(num1,num2);
    }
}
