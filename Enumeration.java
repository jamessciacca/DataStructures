public class Enumeration {

    public enum Grades {
        A("Excellent", 1),
        B("Good", 2),
        C("Average", 3),
        D("Poor", 4),
        F("Fail", 5);

        private  String description;
        private int ordinalValue;


        Grades(String description, int ordinalValue) {
            this.description = description;
            this.ordinalValue = ordinalValue;
        }

        public String getDescription() {
            return description;
        }

        public int getOrdinalValue() {
            return ordinalValue;
        }
    }


    public static void main(String[] args) {

        Grades myGrade = Grades.B;
        System.out.println("Grade: " + myGrade);
        System.out.println("Description: " + myGrade.getDescription());
        System.out.println("Ordinal Value: " + myGrade.getOrdinalValue());

        //All grades
        System.out.println("\nAll Grades:");
        for (Grades grade : Grades.values()) {
            System.out.println("Grade: " + grade + ", Description: " + grade.getDescription() +
                    ", Ordinal Value: " + grade.getOrdinalValue());
        }
    }
}
