public class Main {
    public static void main(String[] args) {


        Student student = new Student("ALmaz", "Baekov", 4456, 4.8);
        System.out.println(student);
        System.out.println(student.getScholarship(student.getAverageMark()));
        Aspirant aspirant = new Aspirant("Akim", "Atashev", 4573, 4.7);
        System.out.println(aspirant);
        System.out.println(aspirant.getScholarship(aspirant.getAverageMark()));
    }
}