package oops;


public class StudentUse {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // Student s1 = new Student();
        Student s2 = new Student("Gauri");
        Student s3 = new Student("Mansi");
        // System.out.println(s1);
        // s1.name = "Jyoti";
        // s1.rollNumber = 10;
        // s1.setRollNumber(100);
        // System.out.println(s1.name + " " + s1.getRollNumber());

        System.out.println(s2.getRollNumber());
        System.out.println(s3.getRollNumber());
        System.out.println(Student.getNumStudents());
        // s2.print();
        // s3.print();
    }
}
