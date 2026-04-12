package java_programming_I.Part_2.part_29;
import java.util.Scanner;
public class Smallest {
    public static int smallest(int number1, int number2) {
        // write your code here
        // do not print anything inside the method
        return (number1>number2 ? number2 : number1);
        // there must be a return command at the end
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = Integer.valueOf(sc.nextLine());
        int num2 = Integer.valueOf(sc.nextLine());
        int answer = smallest(num1, num2);
        System.out.println("Smallest: " + answer);
    }
}
