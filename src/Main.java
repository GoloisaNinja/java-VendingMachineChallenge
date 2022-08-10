import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine machine = new Machine(items);

        while(true) {
            System.out.println();
            System.out.println("\t*************************************************");
            System.out.println("\t\t\t\tWelcome to Java Vending");
            System.out.println("\t*************************************************");
            System.out.println(machine);
            System.out.print("\nPlease select a row: ");
            int row = sc.nextInt();
            sc.nextLine();
            System.out.print("Please select a spot: ");
            int spot = sc.nextInt();
            boolean canDispense = machine.dispense(row, spot);
            if (canDispense) {
                Item bev = machine.getItem(row, spot);
                System.out.println("Enjoy your " + bev.getName() + "! Thank you!");
            } else {
                System.out.println("Sorry - that selection is out of stock :( Please make another selection...");
            }
        }
    }
}