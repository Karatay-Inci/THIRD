package MARCH21Inheritance;

public class I4Department {
    protected String employeeName;
    protected int employeeId;
    protected String position;
    protected double salary;
    I4Department(String employeeName,int employeeId,String position,double salary){
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.position=position;
        this.salary=salary;
    }
    I4Department (){
        this.employeeName="Temp";
        this.employeeId=999;
        this.position="Intern";
        this.salary=1000;
    }
    void changePosition(String newPosition){
        this.position=newPosition;
    }
    void riseSalary(double rise){
        this.salary+=rise;
    }

    @Override
    public String toString() {
        return "I4Department{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
