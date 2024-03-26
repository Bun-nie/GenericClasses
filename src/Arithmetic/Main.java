package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Number n1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        Number n2 = sc.nextDouble();

        Arithmetic result = new Arithmetic(n1, n2);

        System.out.println("Addition: " + result.add());
        System.out.println("Subtraction: " + result.subtract());
        System.out.println("Multiplication: " + result.multiply());
        System.out.println("Division: " + result.divide());
        System.out.println("Minimum: " + result.getMin());
        System.out.println("Maximum: " + result.getMax());
    }
}
