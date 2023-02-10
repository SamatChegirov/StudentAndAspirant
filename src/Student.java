public class Student {
    private String firsName;
    private String lastName;
    private int groupNumber;
    private double averageMark;

    public String getScholarship(double averageMark) {
        if (averageMark >= 5) {
            System.out.println(2000);
        } else {
            System.out.println(1900);
        }
        return "";
    }

    public Student(String firsName, String lastName, int groupNumber, double averageMark) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.averageMark = averageMark;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                ", averageMark=" + averageMark +
                '}';
    }
}
