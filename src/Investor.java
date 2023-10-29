class Investor implements Observer {
    private String name;

    Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println(name + " received an update: " + stockSymbol + " price is now " + price);
    }

    public void subscribe(Stock stock) {
        stock.register(this);
    }
}