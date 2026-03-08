import java.util.Scanner;

class Electricity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Customer Name:");
        String name = sc.nextLine();
    
        
         
        System.out.print("Enter the customer Address:");
        String vis = sc.nextLine();

        

        System.out.print("Enter previous reading: ");
        int prev = sc.nextInt();

        System.out.print("Enter current reading: ");
        int curr = sc.nextInt();

        System.out.print("Enter connection type (1-Domestic, 2-Non Domestic): ");
        int type = sc.nextInt();

        int units = curr - prev;
        double amount = 0;

        if (type == 1) { // Domestic
            if (units <= 100)
                amount = units * 4.80;
            else if (units <= 200)
                amount = units * 5.80;
            else
                amount = units * 6.50;
        } 
        else if (type == 2) { // Non-Domestic
            amount = units * 6.05;
        }

        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: Rs. " + amount);
    }
} 