public abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSales;

    // the constructor
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }
}