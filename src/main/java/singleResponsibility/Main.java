package singleResponsibility;

// Single Responsibility

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
        book.setName("Testing simple responsibility");
        book.setAuthor("Author");
        book.setText("Description of a Book");

        BookPrinter printer = new BookPrinter();
        printer.printTextToConsole(book.getText());

    }
}
