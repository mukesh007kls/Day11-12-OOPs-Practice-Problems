import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Account account=new Account();
        System.out.println("Enter Balance amount:-");
        long accountBalance=sc.nextLong();
        account.debit(accountBalance);
    }
}
