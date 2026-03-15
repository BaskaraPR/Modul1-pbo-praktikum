import java.util.Scanner;

void main() {

    Scanner scan = new Scanner(System.in);
    Building build = new Building();
    int choice;

    do{
        System.out.println("Welcome to Smart City Management System");
        System.out.println("1. Add New Building");
        System.out.println("2. View All Building");
        System.out.println("3. Exit");

        System.out.print("Select an Option: ");
        choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1){
            System.out.print("Enter Building Name: ");
            String buildName = scan.nextLine();
            System.out.print("Enter Building Address: ");
            String buildAddress = scan.nextLine();
            System.out.print("Enter Number of Floors: ");
            int buildFloor = scan.nextInt();

            build.assignData(buildName, buildAddress, buildFloor);

        } else if (choice == 2) {
            build.showData();
        } else {
            break;
        }
    }while (choice != 3);
    System.out.println("City boooyyy!");

}
