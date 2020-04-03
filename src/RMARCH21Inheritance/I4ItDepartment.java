package RMARCH21Inheritance;

public class I4ItDepartment extends I4Department {
    private String skillsSet;
    public I4ItDepartment(String employeeName,int employeeId,String position,double salary,String skillsSet){
        super(employeeName,employeeId,position,salary);
        this.skillsSet=skillsSet;
    }
    public I4ItDepartment(){
        super();
        this.skillsSet="Java";
    }
    public void setSkillsSet(String skillsSet){
        this.skillsSet=skillsSet;
    }
    public String getSkillsSet(){
        return this.skillsSet;
    }
    public void addSkillsSet(String newSkill){
        this.skillsSet=this.skillsSet+" "+newSkill;
    }

    @Override
    public String toString() {
        return "I4ItDepartment{" +
                "skillsSet='" + skillsSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeId=" + employeeId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
