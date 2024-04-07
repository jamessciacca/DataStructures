package Exam2Review;

public class EnumExample {
    //enum short for enumeration, used when you have a predetermined set of values that cannot change, for example the days of the week!
    public enum daysOfTheWeek{
        Sunday, Monday, Tuesday, Wednesday, Thursday,Friday, Saturday;
    }

    public static void main(String[] args){
        daysOfTheWeek day = daysOfTheWeek.Thursday;

        if(day == daysOfTheWeek.Thursday){
            System.out.println("Yay almost Friday!!!");
        }
    }
}
