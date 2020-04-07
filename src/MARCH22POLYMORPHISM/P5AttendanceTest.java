package MARCH22POLYMORPHISM;

public class P5AttendanceTest {
    public static void main(String[] args) {
        String [] students = {"Jack","Tom "," Nick"," Mike"," Adam"};
        int [] ids = {1,2,3,4,5};
        P5Attendance myAtt = new P5Attendance(students, ids);
        myAtt.enterAttendanceToday("tue");
        myAtt.enterAttendanceToday("mon");
        myAtt.printWeeklyAttendance();
        myAtt.findTheMostAttended();
        myAtt.findTheMostAttendedDay();
    }
}