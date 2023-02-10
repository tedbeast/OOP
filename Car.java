public class Car {
    // set to private, because allowing a developer to set negative numwheels makes no sense, we should restrict access
    protected numWheels;
    public int speed;


    public Car(){
        numWheels = 4;
        speed = 65;
    }
    public void move(){
        System.out.println("Car is moving at "+speed +" mph");
    }
}