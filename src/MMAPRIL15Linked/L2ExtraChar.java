package MMAPRIL15Linked;

public class L2ExtraChar {
    public static void main(String[] args) {
        String str = "aA - 12345@88ndkcm";
        System.out.println("char\t digit\t upper\t lower");
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+"\t\t");
            System.out.print(Character.isDigit(str.charAt(i))+"\t");
            System.out.print(Character.isUpperCase(str.charAt(i))+"\t");
            System.out.print(Character.isLowerCase(str.charAt(i))+"\t");
            System.out.print((int)str.charAt(i)-48);  //ASCII LIST 48=0
            System.out.println();
        }
    }
}
