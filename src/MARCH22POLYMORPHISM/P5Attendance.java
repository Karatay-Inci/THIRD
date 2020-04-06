package MARCH22POLYMORPHISM;

import java.util.Arrays;

public class P5Attendance {
    String students[];
    int studentId[];
    int weekly[][];
    final String days[]={"Mon","Tue","Wed","Thu","Fri"};
    public P5Attendance(String students[],int studentId[]) {
        this.students = students;
        this.studentId = studentId;
        int[][] weeklyEmpty = new int[5][students.length];
        this.weekly = weeklyEmpty;
    }
    public void enterAttendanceToday(String today){
        if(today.equalsIgnoreCase("mon")){
            for (int i = 0; i < this.students.length ; i++) {
                this.weekly[0][i]=1;
            }
        }
        else if(today.equalsIgnoreCase("tue")){
            for (int i = 0; i < this.students.length ; i++) {
                this.weekly[1][i]=1;
            }
        }
    }

    @Override
    public String toString() {
        return "P5Attendance{" +
                "students=" + Arrays.toString(students) +
                ", studentId=" + Arrays.toString(studentId) +
                ", weekly=" + Arrays.toString(weekly) +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
