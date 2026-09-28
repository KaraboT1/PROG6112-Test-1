public class SalesReportProject {
    public static void main(String[] args) {
        // single-D array for thecity names
        String[] cities = {
            "CAPE TOWN",
            "PORT ELIZABETH",
            "PRETORIA"
        };
     
        // two-D array: rows = cities, columns = PS5, XBOX, SWITCH
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // print report header
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---");
        System.out.printf("%-18s %-8s %-8s %s%n", "", "PS5", "XBOX", "SWITCH");

        // printimg each city's sales data
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %-8d %-8d %d%n",
                cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("---");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---");

        int highestTotal = 0;
        String topCity = "";

        // Calculate totals & find highest
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.printf("%-18s %d%n", cities[i], cityTotal);

            if (cityTotal > highestTotal) {
                highestTotal = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println("---");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
    }
}