package Class3;

public class T9 {
    public static void main(String[] args) {
        /*
Traffic Light Actions: Declare a String variable
trafficLight and set it to either "Red", "Yellow", or
"Green". Use if-else statements to print "Stop" if the
light is "Red", "Caution" if the light is "Yellow", and
"Go" if the light is "Green"
 */
        String trafficlight="Red";
        if (trafficlight.equals("Red")){
            System.out.println("Stop");
        } else if (trafficlight.equals("Yellow")) {
            System.out.println("caution");

        }else if (trafficlight.equals("Green")){
            System.out.println("Go");
        }
    }
}
