package savingsaccount;

public class SavingsAccount {
    public static double annualInterestRate = 0.06;
    private double savingsBalance;
    SavingsAccount(double x){
        savingsBalance = x;
    }

    public double calculateMonthlyInterest(){
        double monthlyInterest = savingsBalance * annualInterestRate / 12;
        savingsBalance = savingsBalance + monthlyInterest;
        return monthlyInterest;
    }

    public void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }
}
