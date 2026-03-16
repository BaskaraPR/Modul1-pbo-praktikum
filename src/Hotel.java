public class Hotel extends Building{
    private int roomCount;

    public Hotel(String name, String address, int floor, int room){
        super(name, address, floor);
        this.roomCount = room;
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("Number of Available Rooms: " + roomCount);
    }
}
