public class StockPriceMonitoringSystem {
    public static void main(String[] args) {
        // Create stocks
        Stock appleStock = new Stock("AAPL", 150.0);
        Stock googleStock = new Stock("GOOGL", 2500.0);

        // Create investors
        Investor johnDoe = new Investor("John Doe");
        Investor janeSmith = new Investor("Jane Smith");

        // Subscribe investors to stocks
        johnDoe.subscribe(appleStock);
        janeSmith.subscribe(googleStock);

        // Simulate price updates
        appleStock.setPrice(155.0);
        googleStock.setPrice(2600.0);
    }
}