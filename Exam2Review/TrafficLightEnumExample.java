package Exam2Review;

public class TrafficLightEnumExample {
    // Define the TrafficLightColor enum
    public enum TrafficLightColor {
        RED("Stop", 30),
        YELLOW("Caution", 5),
        GREEN("Go", 45);

        private final String description;
        private final int durationInSeconds;

        // Constructor
        TrafficLightColor(String description, int durationInSeconds) {
            this.description = description;
            this.durationInSeconds = durationInSeconds;
        }

        // Getter for description
        public String getDescription() {
            return description;
        }

        // Getter for durationInSeconds
        public int getDurationInSeconds() {
            return durationInSeconds;
        }
    }

    public static void main(String[] args) {
        // Declare a TrafficLightColor variable RED
        TrafficLightColor red = TrafficLightColor.RED;

        // Print out properties of RED
        System.out.println("Traffic Light Color: " + red);
        System.out.println("Description: " + red.getDescription());
        System.out.println("Duration in Seconds: " + red.getDurationInSeconds());

        // Print out all available traffic light colors using an enum iteration
        System.out.println("\nAvailable Traffic Light Colors:");
        for (TrafficLightColor color : TrafficLightColor.values()) {
            System.out.println("Color: " + color);
            System.out.println("Description: " + color.getDescription());
            System.out.println("Duration in Seconds: " + color.getDurationInSeconds() + "\n");
        }
    }
}
