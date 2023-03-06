import java.util.Scanner;

public class Account {
    private int debitAmount;
    Scanner sc=new Scanner(System.in);
    public void debit(long balanceAmount){
        System.out.println("Enter Amount to debit:-");
        debitAmount=sc.nextInt();
        if(debitAmount>balanceAmount){
            System.out.println("Debit amount "+debitAmount+" in greater than balance amount"+balanceAmount);
        }else {
            balanceAmount-=debitAmount;
            System.out.println("Debited amount of "+debitAmount+" successful balance amount is "+balanceAmount);
        }
    }
}
