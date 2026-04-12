package java_programming_I.Part_4.part_16;
import java.util.Scanner;
public class PaymentCard {
    private double balance;
    public PaymentCard(double openingBalance)
    {
        this.balance = openingBalance;
    }
    public void eatAffordably()
    {
        if(balance>=2.6)
        balance-=2.6;
    }
    public void eatHeartily()
    {
        if(balance>=4.6)
        balance-=4.6;
    }
    public void addMoney(double amount)
    {
        if(amount>0)
        balance = (balance+amount)>150 ? 150 : (balance+amount);
    }
    public String toString()
    {
        return String.format("The card has a balance of %.2f euros", balance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Part 1
        int balance = Integer.valueOf(sc.nextLine());
        PaymentCard card = new PaymentCard(balance);
        System.out.println(card.toString());
        //We can also write - System.out.println(card); - Prints the toString() function because
        // Your method: public String toString() is overriding the default toString() method from Object.

        // Part 2
        card.eatAffordably();
        System.out.println(card); // or System.out.println(card.toString());

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card); // or System.out.println(card.toString());

        // Part 3 - The functions do not print any negative balance

        // Part 4
        System.out.print("Enter money to be added: ");
        double amt = Double.valueOf(sc.nextLine());
        card.addMoney(amt);
        System.out.println(card);
    }
}
