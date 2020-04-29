package MMAPRIL5exceptions;

public class E9NextLetters {
    public static void main(String[] args) {
        E9NextLetters myLtr = new E9NextLetters();
        System.out.println(myLtr.sentence);
        myLtr.printNextLetters();

        E9NextLetters myLtr2 = new E9NextLetters("Java is fun");
        System.out.println(myLtr2.sentence);
        myLtr2.printNextLetters();
    }
    String sentence;
    public E9NextLetters(){

    }
    public E9NextLetters(String sentence){
        this.sentence=sentence;
    }
    public void printNextLetters(){
        char letter;
        try {
            for (int i = 0; i <=this.sentence.length() ; i++) {
                letter=this.sentence.charAt(i);
                letter++;
                System.out.print(letter);
            }
        }
        catch (NullPointerException e){
            System.out.println("String is null!!");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("\t Hold on champ you exceeded");
        }
        catch (Exception e){
            System.out.println("Daddy got you");
        }
    }
}
