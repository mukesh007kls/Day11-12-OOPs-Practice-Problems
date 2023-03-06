import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
    List<Stock> stockList=new ArrayList<>();
    private int  portfolioSize;
    private int totalValueOfStocks;
    Scanner sc=new Scanner(System.in);
    public void stockPortfolio(){
        System.out.println("Enter the number of stocks you want to enter:-");
        portfolioSize= sc.nextInt();
        for (int i = 0; i < portfolioSize; i++) {
            Stock stock=new Stock();
            System.out.println("Enter Share Name:-");
            stock.setShareName(sc.next());
            System.out.println("Enter Number of share:-");
            stock.setNumberOfShare(sc.nextInt());
            System.out.println("Enter price of each share:-");
            stock.setSharePrice(sc.nextInt());
            stock.setValueOfStock(stock.getNumberOfShare()*stock.getSharePrice());
            totalValueOfStocks+=stock.getValueOfStock();
            stockList.add(i,stock);
        }
        System.out.println("Total stock value:-"+totalValueOfStocks);
    }
}