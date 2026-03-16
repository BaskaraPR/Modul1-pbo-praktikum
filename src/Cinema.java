public class Cinema extends Building{
    private int screenCount;

    public Cinema(String name, String address, int floor, int screenCount){
        super(name, address, floor);
        this.screenCount = screenCount;
    }

    @Override
    public void showData(){
        super.showData();
        System.out.println("Number of Available Screen: " + screenCount);
    }
}
