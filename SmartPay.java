import java.util.*;
interface Billable {
    double calculateTotal();
}
class UtilityBill implements Billable {
    private String name; // Person Name
    private int unit;   // Unnits Consumed
    
    // Initialize Customer Name and Units Consume
    public UtilityBill(String name, int unit) {
        this.name = name;
        this.unit = unit;
    }

    // Calculate total bill as per rate
    @Override
    public double calculateTotal() {
        double total = 0;
        if (unit <= 100) {
            total = unit * 1;
        } else if (unit <= 300) {
            total = (100*1)+((unit-100)*2);
        } else {
            total = (100*1)+(200*2)+((unit-300)*5);
        }
        return total;
    }

    //Print reciept format
    public void receipt() {
        double final_money = calculateTotal(); // calculated base amount
        double tax_money = final_money * 0.18; //18% tax
        System.out.println("\n--- Digital Receipt ---");
        System.out.println("Customer Name  : " + name);
        System.out.println("Units Consumed : " + unit);
        System.out.println("Tax Amount     : Rs" +String.format("%.2f",tax_money));
        System.out.println("Final Total    : Rs" +String.format("%.2f",(final_money+tax_money)));
        System.out.println("-----------------------\n");
    }
}
public class SmartPay {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true) {
            // Enter customer Name
            System.out.print("Enter Customer Name (else type 'Exit' to exit): ");
            String name =sc.nextLine();
            // For Exit
            if (name.equalsIgnoreCase("Exit")) {
                break;
            }
            // Enter Meter Reading
            System.out.print("Enter Last Reading: ");
            int last =sc.nextInt();
            System.out.print("Enter Today's Reading: ");
            int now =sc.nextInt();
            sc.nextLine(); 
            // Check Units are valid 
            if (now<last) {
                System.out.println("Error: now reading could not be lower than last reading.\n");
            } else {
                // Total Consumed Units in a Month
                int UConsumed = now - last;
                //Create bill object and print receipt
                UtilityBill bill = new UtilityBill(name,UConsumed);
                bill.receipt();
            }
        }
        sc.close();
    }
}
