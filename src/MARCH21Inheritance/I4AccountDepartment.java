package MARCH21Inheritance;

public class I4AccountDepartment extends I4Department{
    private int yearOfExperience;

    public I4AccountDepartment(String employeeName,int employeeId,String position,double salary,int yearOfExperience){
        super(employeeName,employeeId,position,salary);
        this.yearOfExperience=yearOfExperience;

    }
    public void setYearOfExperience(int years) {

        this.yearOfExperience = yearOfExperience;
    }

    public int getYearOfExperience() {

        return yearOfExperience;
    }
    public void addYearsOfExperience(int years){

        this.yearOfExperience+=years;
    }

    @Override
    public String toString() {
        return "I4AccountDepartment{" +
                "yearOfExperience=" + yearOfExperience +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
