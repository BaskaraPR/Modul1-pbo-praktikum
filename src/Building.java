public class Building {
    String buildName;
    String buildAddress;
    int buildFloor;

    void assignData(String name, String address, int floor ){
        this.buildName = name;
        this.buildAddress = address;
        this.buildFloor = floor;
        showData();
        System.out.println("Building Added Successfully");
    }

    void showData(){
        System.out.println("=============");
        System.out.println("Building Name: " + buildName);
        System.out.println("Building Address: " + buildAddress);
        System.out.println("Number of Floors: " + buildFloor);
        System.out.println("=============");
    }
}
