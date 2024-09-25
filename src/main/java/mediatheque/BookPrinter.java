package mediatheque;

public class BookPrinter implements MediaVisitor{
    @Override
    public void visit(Book book) {
        book.print();
    }

    @Override
    public void visit(CD cd) {

    }
}
