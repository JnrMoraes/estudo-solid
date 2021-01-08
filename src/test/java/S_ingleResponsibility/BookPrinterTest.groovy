package S_ingleResponsibility

import spock.lang.Specification

class BookPrinterTest extends Specification {
    def "Print an Description Book on console using a book "() {

        given: "A book"
        Book book = new Book();
        book.setName("Testing simple responsibility")
        book.setAuthor("Norman Rockwell");
        book.setText("Description of a Book")

        BookPrinter bookPrinter = new BookPrinter();

        when: "Getting a Description with printer "
        String response = bookPrinter.printTextToConsole(book.getText())

        then: "Got a book with text attribute filed "
        response == "Description of a Book"
    }
}
