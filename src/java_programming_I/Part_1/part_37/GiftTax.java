package java_programming_I.Part_1.part_37;
import java.util.Scanner;
public class GiftTax {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double percent = 0.01;
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(sc.nextLine());
        int base_price = 0;
        int excess_price = 0;
        double tax = 0.0;
        if(value<5000)
        {
            System.out.println("No tax!");
        }

        else
        {
            if(value>=5000 && value<25000)
            {
                base_price = 5000;
                excess_price = value - base_price;
                tax = 100 + excess_price*8*percent;
            }
            else if(value>=25000 && value<55000)
            {
                base_price = 25000;
                excess_price = value - base_price;
                tax = 1700 + excess_price*10*percent;
            }
            else if(value>=55000 && value<200000)
            {
                base_price = 55000;
                excess_price = value - base_price;
                tax = 4700 + excess_price*12*percent;
            }
            else if(value>=200000 && value<1000000)
            {
                base_price = 200000;
                excess_price = value - base_price;
                tax = 22100 + excess_price*15*percent;
            }
            else
            {
                base_price = 1000000;
                excess_price = value - base_price;
                tax = 142100 + excess_price*17*percent;
            }

            System.out.println("Tax: " + tax);
        }

    }
}
