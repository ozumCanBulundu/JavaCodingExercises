// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name=name;
        this.size=size;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at "+ currentDirection + "degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move():Move at " + currentVelocity + "in direction" + currentDirection);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
