package java_programming_I.Part_4.part_09;

public class Debt {
    private double balance, interestRate;
    public Debt(double initialBalance, double initialInterestRate)
    {
        balance = initialBalance;
        interestRate = initialInterestRate;
    }
    public void printBalance()
    {
        System.out.println(balance);
    }
    public void waitOneYear()
    {
        balance *= interestRate;
    }

    public static void main(String[] args) {

        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();
    }
}
