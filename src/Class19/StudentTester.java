package Class19;

public class StudentTester {
    public static void main(String[] args) {
        Student[] Arr={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (Student student: Arr) {
            student.attending();
            student.studying();
            student.watching();

        }
    }
}
