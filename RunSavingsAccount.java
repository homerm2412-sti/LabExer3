
package labexer3;
import java.util.Scanner;
public class RunSavingsAccount {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in) ;
        SavingsAccount savings = new SavingsAccount();
        System.out.println("Enter interest rate (e.g. .05 for 5%) : ");
        double rate = sc.nextDouble();
        
        SavingsAccount.setInterestRate(rate);
        System.out.println("Enter the amount to deposit: $");
        double InitialDeposit = sc.nextDouble();
        savings.deposit(InitialDeposit);
        System.out.println("Press Q to Deposit again or E to withdraw: ");
        
        char choice = sc.next().toUpperCase().charAt(0);
        if (choice == 'Q') {
            System.out.println("Enter the amount to Deposit: $");
            double amount = sc.nextDouble();
            double withdrawn = savings.withdraw(amount);
            
            if (withdrawn == 0) {
                System.out.println("The Balance is insufficient.");
            
        }else {
            System.out.println("You withdrew $" + withdrawn);
            }
        }else {
            System.out.println("INVALID OPTION");
            
        }
        SavingsAccount.showBalance(savings);
        if (savings.getBalance() > 1000) {
            savings.addInterest();
            System.out.println("Interest Applied.");
            SavingsAccount.showBalance(savings);
        }
        sc.close();
        
    }
}
