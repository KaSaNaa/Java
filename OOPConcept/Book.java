class Book // here we created a class called "Book"
{
    public void open() /* created one method called "open" */ {
        System.out.println("Opening");
    }
    // now we can create another method called "close" to close the book
    public void close(){
        System.out.println("Closing");
    }
}

class Main {
    public static void main(String[] args) {

        Book x = new Book(); // inside that class we created "Book", we create a obejct(new book) called x
        x.open();
        x.close();

        // guess we want to create another book
        Book y = new Book();
        y.open();
        y.close();

    }
}