

package carassign;


public class Car {
    
    int speed, accelerator, brake;
    String color;
    String model;
    
        int speedometer(int x)
    {
        speed = x;
        return speed;
    }
        
    void printcarinfo()
    {
//        System.out.println("Speed: " + speed + "km/h");
        System.out.println("Colour: " + color);
        System.out.println("Model: " + model);
    }
    
    int increase(int x)
    {
        speed = x;
        accelerator = speed + 1;
        return accelerator;
    }
    
        int decrease(int x)
    {
        speed = x;
        brake = speed - 1;
        return brake;
    }
}
