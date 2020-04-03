package RMARCH21Inheritance;

public class I4DepartmentTest {
    public static void main(String[] args) {
        I4Department myEmp = new I4Department("Rumeysa",123,"QA",12000);
        System.out.println(myEmp.toString());
        System.out.println();

        I4ItDepartment myIt = new I4ItDepartment("Mehmet",124,"Testing",120000,"Selenium");
        System.out.println(myIt.toString());
        myIt.addSkillsSet("SQL");
        System.out.println();
        System.out.println(myIt.toString());
        System.out.println();

        I4AccountDepartment myAcc = new I4AccountDepartment("Inci",125,"QA",120000,15);
        System.out.println(myAcc.toString());

        System.out.println();
        myAcc.addYearsOfExperience(2);
        System.out.println(myAcc.toString());
    }


}
