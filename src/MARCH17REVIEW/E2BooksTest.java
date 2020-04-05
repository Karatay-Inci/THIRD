package MARCH17REVIEW;

public class E2BooksTest {
    public static void main(String[] args) {
        E2Books myBook = new E2Books("War and Peace","Tolstoy","01242342",1200,true,"","");
        System.out.println(myBook.toString());
        myBook.borrowBook("1/11/2020");
        System.out.println(myBook.getBorrowDate());
        System.out.println(myBook.isAvailable());
        myBook.borrowBook("1/11/2020");
        myBook.returnBook("1/12/2020");
        System.out.println(myBook.isAvailable());
    }
}
