package MMAPRIL1Review;

public class M7ExpoPlannerTest {
    public static void main(String[] args) {
        M7ExpoPlannerQ expo1 = new M7ExpoPlannerQ();
        expo1.listAll();
        expo1.addEvent("May 30th","Java OOP");
        expo1.listAll();
       // expo1.deleteEvent("May 30th");
        String[] checkList = {"A","B","C","D","A","B","C","D","E","F"};
        expo1.modifyCheckList("May 30th",checkList);
        expo1.listAll();
    }
}
