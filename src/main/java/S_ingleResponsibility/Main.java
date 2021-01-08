package S_ingleResponsibility;

// Single Responsibility

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        book.setName("Testing simple responsibility");
        book.setAuthor("Norman Rockwell");
        book.setText("Description of a Book");

        BookPrinter printer = new BookPrinter();
        System.out.println(printer.printTextToConsole(book.getText()));


    }
}
