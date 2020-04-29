package MMAPRIL5exceptions;

public class E12 {
    public static void main(String[] args) {
        String arr[] ={"1","12",null,null,"123",null,"1234"};

        for (int i = 0; i <arr.length ; i++) {
            try {
                System.out.println(arr[i].length());
            }
            catch (Exception e){
                System.out.println("opps");
            }
            System.out.println("inside for loop after try catch");
        }
        System.out.println("Rest of the code");
    }
}

