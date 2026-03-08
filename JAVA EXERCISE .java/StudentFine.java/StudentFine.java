import java.util.Scanner;

class StudentFine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int choice;
        int totalFine = 0;

        do {
            System.out.println("\n--- Fine Menu ---");
            System.out.println("1. Not wearing ID");
            System.out.println("2. Not wearing shoes");
            System.out.println("3. Casual leave taken");
            System.out.println("4. Not returning library book");
            System.out.println("5. Breakage of lab item");
            System.out.println("6. ---Total Fine Amount---");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of days:");
                    int idDays = sc.nextInt();
                    totalFine +=idDays*150;
                    break;



                case 2:
                    System.out.print("Enter no of days:");
                    int shoeDays = sc.nextInt();
                    totalFine +=shoeDays*250;
                    break;

                case 3:
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    int fine = days * 10;
                    totalFine += fine;

                    if (fine > 50) {
                        System.out.println("Warning: Suspension message generated!");
                    }
                    break;

                case 4:
                    System.out.print("Enter number of days: ");
                    int d = sc.nextInt();
                    System.out.print("Enter number of books: ");
                    int books = sc.nextInt();
                    totalFine += d * books * 20;
                    break;

                case 5:
                    System.out.print("Enter number of items: ");
                    int items = sc.nextInt();
                    totalFine += items * 10000;
                    break;

                case 6:
                    System.out.println("TotalFine Amount...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

        System.out.println("\n--- Fine Details ---");
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Total Fine   : Rs. " + totalFine);
    }
}