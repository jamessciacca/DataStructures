public class TrafficLightEnumerationExample {
    enum TrafficLightColor {
        RED("stop", 30), GREEN("go", 45), YELLOW("slow down", 5);

        private String description;
        private int duration;

        TrafficLightColor(String description, int duration) {
            this.description = description;
            this.duration = duration;
        }

        public String getDescription() {
            return description;
        }

        public int getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {
        TrafficLightColor currentColor = TrafficLightColor.RED;
        System.out.println("The current color is " + currentColor);
        System.out.println("The current color means " + currentColor.getDescription());

        for (TrafficLightColor color : TrafficLightColor.values()) {
            System.out.println("The color " + color + " means " + color.getDescription());
        }
    }
}