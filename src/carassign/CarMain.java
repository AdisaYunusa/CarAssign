

package carassign;


public class CarMain {

 
    public static void main(String[] args) {
        Car x1 = new Car();
        int ans;
        System.out.println("Thank you for using CarAmebo. \nPlease kindly find the information of your car below:");
//        x1.speed = 150;
        ans = x1.speedometer(200);
        System.out.println("Speed: " + ans + "km/h");
        x1.color = "Blue";
        x1.model = "Honda";
        x1.printcarinfo();
        System.out.println();
        ans = x1.increase(200);
        System.out.println("Warning! Increase in acceleration");
        System.out.println("Your current speed: " + ans + "km/h");
        System.out.println();
        ans = x1.decrease(200);
        System.out.println("Decrease in acceleration");
        System.out.println("Your current speed: " + ans + "km/h");
      
        
    }
    
}
