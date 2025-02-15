package week9;

public class StockPricePlus extends StockPrice {
    
    private int numPrinted;
    
    private static int totalPrinted = 0;
    
    public StockPricePlus(String ticker, String date, double open,
            double high, double low, double close, long volume) {
        super(ticker, date, open, high, low, close, volume);
        numPrinted = 0;
    }

    public static int getTotalPrinted() {
        return totalPrinted;
    }
    
    @Override
    public String toString() {
        numPrinted++;
        totalPrinted++;
        return super.toString() + "\nPrinted " + numPrinted + " times";
    }
    
    public static void printStockPrice(StockPrice[] stockArray) {
        for (int i = 0; i < stockArray.length; i++) {
            System.out.println(stockArray[i]);            
        }
    }
    
    public static void main(String[] args) {
        
//        StockPricePlus spp1 = new StockPricePlus("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
//        System.out.println(spp1);
//        System.out.println(spp1);
//        System.out.println(spp1);
        
        StockPrice[] sPArr = new StockPrice[2];
        sPArr[0] = new StockPrice("AAPL", "2007-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        sPArr[1] = new StockPricePlus("AAPL", "2006-12-1", 91.8, 92.33, 90.1, 91.32, 28395700);
        printStockPrice(sPArr);
        
    }
}
