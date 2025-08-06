
package labexer3;

public class SavingsAccount {
   private double balance;
    public static double InterestRate = 0;
    public SavingsAccount(){
      balance = 0;
  }
  public static void setInterestRate(double newRate){
      InterestRate = newRate;
      
  }
  public static double getInterestRate(){
      return InterestRate;
  }
  public  double getBalance() {
      return balance;
  }
  public void deposit (double amount) {
      balance += amount;
  }
  public double withdraw(double amount) {
      if (balance >= amount) {
          balance -= amount;
          return amount;
      }else {
          return 0;
      }
  }
  public void addInterest() {
      double interest = balance * InterestRate;
      balance += interest;
  }
  public static void showBalance(SavingsAccount Account) {
      System.out.println("Current Balance: $" + Account.getBalance());
  }
}


