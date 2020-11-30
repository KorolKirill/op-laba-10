public class Student {
    private final String name; // ім’я, прізвище
    private final String markBookIndex; // номер залікової книжки
    private double GPA; //середній бал

    public Student(String name, String markBookIndex, double GPA) {
        this.name = name;
        this.markBookIndex = markBookIndex;
        this.GPA = GPA;

    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    public String getMarkBookIndex() {
        return markBookIndex;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

}
