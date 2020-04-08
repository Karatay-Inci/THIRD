package MARCH22POLYMORPHISM;

public class P5LabAttendanceTest {
    public static void main(String[] args) {
        String students[]={"melih","adam","ismail"};
        int[] studentIds = {1,2,3};
        String labSubjects[]={"inheritance","polymorhism","interfaces"};
        P5LabAttendance myLab = new P5LabAttendance(students,studentIds,labSubjects);
        int [] grades = {100,100,100};
        myLab.enterGrades("inheritance",grades);
        myLab.printAllGrades();
        myLab.printAttendanceGrades();
    }
}
