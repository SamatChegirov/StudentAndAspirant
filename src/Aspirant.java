public class Aspirant extends Student {
    public Aspirant(String firsName, String lastName, int groupNumber, double averageMark) {
        super(firsName, lastName, groupNumber, averageMark);
    }

    @Override
    public String getScholarship(double averageMark) {
        if (averageMark >= 5) {
            System.out.println(2500);
        } else {
            System.out.println(2000);
        }
        return "";
    }
}
