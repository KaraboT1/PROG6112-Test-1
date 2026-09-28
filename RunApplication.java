import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = input.nextInt();
        input.nextLine();

        String selectedType = "";
        switch (choice) {
            case 1: selectedType = "PS5"; break;
            case 2: selectedType = "XBOX"; break;
            case 3: selectedType = "SWITCH"; break;
            default:
                System.out.println("Invalid selection");
                input.close();
                return;
        }

        System.out.print("enter the store name: ");
        String store = input.nextLine();

        System.out.print("Enter the total sales of " + selectedType +
                         " consoles for " + store + ": ");
        int sales = input.nextInt();

        Console_Sales report = new Console_Sales(selectedType, store, sales);
        report.printReport();

        input.close();
    }
}