class UniversityStudent {
    static String universityName = "National Technical University";
    static int totalStudents = 0;
    String studentName;
    int rollNo;

    static {
        System.out.println("[Static Block] University system initialized. Total students registered: " + totalStudents);
    }

    public UniversityStudent(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        totalStudents++;
    }

    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo + " | Name: " + studentName + " | University: " + universityName);
    }

    public static void displayStudentCount() {
        System.out.println("[Static Method] Total active students in system: " + totalStudents);
    }

    static class AdmissionDepartment {
        public static void notice() {
            System.out.println("[Static Nested Class] Notice from " + universityName + " : Admissions are open!");
        }
    }
}

public class A10d {
    public static void main(String[] args) {
        UniversityStudent.displayStudentCount();
        System.out.println("\n--- Creating Student Objects ---");
        UniversityStudent s1 = new UniversityStudent("Rahul Sharma", 101);
        UniversityStudent s2 = new UniversityStudent("Priya Patel", 102);
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        System.out.println("\n--- Accessing Static Members ---");
        UniversityStudent.displayStudentCount();
        UniversityStudent.universityName = "Global Tech University";
        System.out.println("After modifying shared static variable:");
        s1.displayStudentDetails();
        s2.displayStudentDetails();

        System.out.println("\n--- Instantiating Static Nested Class ---");
        UniversityStudent.AdmissionDepartment.notice();
    }
}