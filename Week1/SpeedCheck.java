package Week1;

public class SpeedCheck {
    public static void main(String[] args){
        int speedLimit = 60; //Units km/hr
        int carSpeed = 61; //Units km/hr
        if (carSpeed>speedLimit){
            System.out.println("Overspeeding! Pay Fine");
        }
        else {
            System.out.println("You are within the speed limit");
        }

    }
}
