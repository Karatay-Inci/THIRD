package MAPRIL5exceptions;

public class E11 {
    public static void main(String[] args) {
        String arr[] ={"1","12",null,null,"123",null,"1234"};
        try{
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i].length());
            }
        }
        catch (Exception e){
            System.out.println("opps");
        }
        System.out.println("Rest of the code");
    }
}
