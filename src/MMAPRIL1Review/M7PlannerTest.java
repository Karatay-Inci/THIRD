package MMAPRIL1Review;

public class M7PlannerTest {
    public static void main(String[] args) {
        M7Planner plnr = new M7Planner();
        plnr.addEvent("April 10","Java Strings");
        plnr.addEvent("May 12","    Java Collections");
        plnr.addEvent("June 15","    Interview prep");
        plnr.deleteEvent("May 12");



    }
}
