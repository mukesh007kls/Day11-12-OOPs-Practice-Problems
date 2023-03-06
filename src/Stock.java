public class Stock {
    private String shareName;
    private int numberOfShare;
    private int sharePrice;
    private int valueOfStock;

    public Stock() {
    }

    public Stock(String shareName, int numberOfShare, int sharePrice, int valueOfStock) {
        this.shareName = shareName;
        this.numberOfShare = numberOfShare;
        this.sharePrice = sharePrice;
        this.valueOfStock = valueOfStock;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getValueOfStock() {
        return valueOfStock;
    }

    public void setValueOfStock(int valueOfStock) {
        this.valueOfStock = valueOfStock;
    }

    @Override
    public String toString() {
        return "\nStock{" +
                "shareName='" + shareName + '\'' +
                ", numberOfShare=" + numberOfShare +
                ", sharePrice=" + sharePrice +
                ", valueOfStock=" + valueOfStock +
                '}';
    }
}
