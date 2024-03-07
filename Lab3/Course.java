package Lab3;

public class Course {

    private String courseName;

    private String sectionNumber;

    private String numberOfCredits;

    private String link;

    public String getCourseName() {

        return courseName;

    }

    public void setCourseName(String courseName) {

        this.courseName = courseName;

    }

    public String getSectionNumber() {

        return sectionNumber;

    }

    public void setSectionNumber(String sectionNumber) {

        this.sectionNumber = sectionNumber;

    }

    public String getNumberOfCredits() {

        return numberOfCredits;

    }

    public void setNumberOfCredits(String numberOfCredits) {

        this.numberOfCredits = numberOfCredits;

    }

    public String getLink() {

        return link;

    }

    public void setLink(String link) {

        this.link = link;

    }

    public Course() {

    }

    public Course(String courseName, String sectionNumber, String numberOfCredits, String link) {

        super();

        this.courseName = courseName;

        this.sectionNumber = sectionNumber;

        this.numberOfCredits = numberOfCredits;

        this.link = link;

    }

    public Course(Course cs) {

        super();

        this.courseName = cs.courseName;

        this.sectionNumber = cs.sectionNumber;

        this.numberOfCredits = cs.numberOfCredits;

        this.link = cs.link;

    }

    @Override

    public String toString() {

        return courseName + " " + sectionNumber + " " + numberOfCredits + " " + link;

    }

}
