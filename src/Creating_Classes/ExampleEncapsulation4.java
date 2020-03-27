package Creating_Classes;

public class ExampleEncapsulation4 {
    private int id;
    private double salary;

    public ExampleEncapsulation4(int id, double salary){
        this.id=id;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
