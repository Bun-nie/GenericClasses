package Arithmetic;

import Map.MyMap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            Integer n1 = sc.nextInt();
            System.out.print("Enter second number: ");
            Double n2 = sc.nextDouble();

            Arithmetic<Integer, Double> result = new Arithmetic<>(n1, n2);

            System.out.println("Addition: " + result.add());
            System.out.println("Subtraction: " + result.subtract());
            System.out.println("Multiplication: " + result.multiply());
            System.out.println("Division: " + result.divide());
            System.out.println("Minimum: " + result.getMin());
            System.out.println("Maximum: " + result.getMax());
        } catch (InputMismatchException e) {
            System.err.println("ERROR! First number must be INTEGER and Second number must be DOUBLE!");
        }
    }
}
