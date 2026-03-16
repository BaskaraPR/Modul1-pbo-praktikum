import java.util.Scanner;
import java.util.ArrayList;


void main() {
    Scanner scan = new Scanner(System.in);
    ArrayList<Building> buildings = new ArrayList<>();

    int choice;

    do{
        System.out.println("Welcome to Smart City Management System");
        System.out.println("1. Add New Building");
        System.out.println("2. Add New Cinema");
        System.out.println("3. Add New Hotel");
        System.out.println("4. View All Building");
        System.out.println("5. Exit");

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

            Building build = new Building(buildName, buildAddress, buildFloor);
            buildings.add(build);
            System.out.println("Building Added Successfully");
            build.showData();

        } else if (choice == 2) {
            System.out.print("Enter Building Name: ");
            String buildName = scan.nextLine();
            System.out.print("Enter Building Address: ");
            String buildAddress = scan.nextLine();
            System.out.print("Enter Number of Floors: ");
            int buildFloor = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Number of Screens: ");
            int buildScreen = scan.nextInt();
            scan.nextLine();

            Cinema cinema = new Cinema(buildName, buildAddress, buildFloor, buildScreen);
            buildings.add(cinema);
            System.out.println("Cinema Added Successfully");
            cinema.showData();
        } else if (choice == 3) {
            System.out.print("Enter Hotel Name: ");
            String buildName = scan.nextLine();
            System.out.print("Enter Hotel Address: ");
            String buildAddress = scan.nextLine();
            System.out.print("Enter Number of Floors: ");
            int buildFloor = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Number of Rooms: ");
            int buildRoom = scan.nextInt();
            scan.nextLine();

            Hotel hotel = new Hotel(buildName, buildAddress, buildFloor, buildRoom);
            buildings.add(hotel);
            System.out.println("Hotel Added Successfully");
            hotel.showData();
        } else if (choice == 4) {
            if (buildings.isEmpty()) {
                System.out.println("No buildings available.");
            } else {
                for (Building b : buildings) {
                    b.showData();
                }
            }

        } else {
            break;
        }
    }while (choice != 5);
    System.out.println("City boooyyy!");

}
