package week8;

public class StockPrice {
    // Instance variables
    private String ticker;
    private String date;
    private double open, high, low, close;
    private long volume;

    // Constructor
    public StockPrice(String ticker, String date, double open,
            double high, double low,
            double close, long volume) {
        // assign variables
        this.ticker = ticker;
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;

        // System.out
        System.out.println("Stock " + ticker + " " + date + " created.");
    }

    // Getters
    public String getTicker() {
        return ticker;
    }

    public String getDate() {
        return date;
    }

    public double getOpen() {
        return open;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getClose() {
        return close;
    }

    public long getVolume() {
        return volume;
    }
    // spread method
    public double getSpread(){
        return high - low;
    }

    public String toString(){
        return "Stock: ticker=" + ticker + ", date=" + date +
                ", opening price=" + open + ", closing price=" + close +
                ", high=" + high + ", low=" + low +
                ", volume=" + volume;
        }    
    
}

