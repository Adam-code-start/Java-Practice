package java_programming_I.Part_2.part_31;
import java.util.Scanner;
public class Averaging {
    public static double sum(double number1, double number2, double number3, double number4) {
        // you can copy your implementation of the method sum here
        return (number1 + number2 + number3 + number4);
    }

    public static double average(double number1, double number2, double number3, double number4) {
        // write your code here
        // calculate the sum of the elements by calling the method sum
        double sum = sum(number1, number2, number3, number4);
        return (sum/4);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double num1 = Double.valueOf(sc.nextLine());
        double num2 = Double.valueOf(sc.nextLine());
        double num3 = Double.valueOf(sc.nextLine());
        double num4 = Double.valueOf(sc.nextLine());
        double result = average(num1, num2, num3, num4);
        System.out.println("Average: " + result);
    }
}
