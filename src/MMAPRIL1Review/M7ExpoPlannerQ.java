package MMAPRIL1Review;

public class M7ExpoPlannerQ extends M7Planner{
    String expoName;
    String [][] checkList;
    M7ExpoPlannerQ(){
        super();
        this.expoName="default";
        this.checkList = new String[10][4];
    }
    void listAll(){
        System.out.println("Date\t\t Event\t\t\tCheck List");
        for (int i = 0; i <super.datesEvents.length ; i++) {
            System.out.print(super.datesEvents[i][0]+"\t\t"+super.datesEvents[i][1]+"\t");
            for (int j = 0; j <this.checkList[i].length ; j++) {
                System.out.print(this.checkList[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void modifyCheckList(String date,String checkList[]){
        int index = 0;
        for (int i = 0; i <super.datesEvents.length ; i++) {
            if (super.datesEvents[i][0].equalsIgnoreCase(date)){
                index = i;
            }
        }
        this.checkList[index]= checkList;
    }
}
