import java.util.Scanner;

public class Task307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of stores: ");
        int numStores = sc.nextInt();

        if (numStores < 1) {
            System.out.println("Number of stores must be at least 1.");
        } else {
            int totalAllItems = 0;
            int maxItems = -1;
            int bestStore = 0;

            for (int store = 1; store <= numStores; store++) {
                int numCustomers;
                do {
                    System.out.print("Store " + store + " - number of customers: ");
                    numCustomers = sc.nextInt();
                    if (numCustomers < 1) {
                        System.out.println("Customers must be at least 1. Retry!");
                    }
                } while (numCustomers < 1);

                int storeItems = 0;

                for (int c = 1; c <= numCustomers; c++) {
                    int items;
                    do {
                        System.out.print("  Customer " + c + " - items bought: ");
                        items = sc.nextInt();
                        if (items < 0) {
                            System.out.println("  Items cannot be negative. Retry!");
                        }
                    } while (items < 0);
                    storeItems += items;
                }

                System.out.println("Store " + store + " - customers: " + numCustomers
                        + ", total items: " + storeItems);

                totalAllItems += storeItems;

                if (storeItems > maxItems) {
                    maxItems = storeItems;
                    bestStore = store;
                }
            }

            System.out.println("Total items across stores: " + totalAllItems);
            System.out.println("Store with the most items: " + bestStore);
        }

        sc.close();
    }
}