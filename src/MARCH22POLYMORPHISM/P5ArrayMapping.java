package MARCH22POLYMORPHISM;

public class P5ArrayMapping {
    public static void main(String[] args) {
        String [] students = {"Jack","Tom","Nick","Donald","Adam"};
        String [] days      = {"Mon","Tue","Wed","Thu","Fri"};
        int [][] attendance = new int [5][5];
        for (int i = 0; i <days.length ; i++) {
            System.out.print(days[i]+"\t\t");
            for (int j = 0; j <students.length ; j++) {
                System.out.print(attendance[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
