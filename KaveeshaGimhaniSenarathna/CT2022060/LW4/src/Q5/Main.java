package Q5;

public class Main {

    public static void main(String[] args) {

        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Mr. keseven");
        lecturer.setCourseTeaching("OOP");

        Course course = new Course();
        course.setCourseName("Object Oriented Programming");
        course.setCourseCode("CTEC22043");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Shashika");
        student.setDegreeName("BICT");
        student.setCourseFollowing("OOP");

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());

        System.out.println("Lecturer: " + course.getLecturer().getLecturerName());

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Degree: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing());
    }
}
