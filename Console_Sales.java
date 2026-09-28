public class Console_Sales extends Consoles {

    public Console_Sales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    public void printReport() {
        System.out.println("******************************");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("******************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}