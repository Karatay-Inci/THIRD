package MARCH22POLYMORPHISM;

public class P5AttendanceTest {
    public static void main(String[] args) {
        String [] students = {"Jack","Tom","Nick","Donald","Adam"};
        int [] ids = {1,2,3,4,5};
        P5Attendance myAtt = new P5Attendance(students, ids);
        System.out.println(myAtt);
    }
}
